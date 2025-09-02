import { CommonModule } from '@angular/common';
import { Component, inject } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { CartService } from '../../../../services/cart.service';
import { OrderService } from '../../../../services/order.service';

@Component({
  selector: 'app-check-out',
  imports: [CommonModule,RouterLink,ReactiveFormsModule],
  templateUrl: './check-out.component.html',
  styleUrl: './check-out.component.css'
})
export class CheckOutComponent {
 private fb = inject(FormBuilder);
  private cart = inject(CartService);
  private orders = inject(OrderService);
  private router = inject(Router);
  form = this.fb.group({ address: ['', Validators.required] });
  get hasItems() { return this.cart.items().length > 0; }
  place() {
    const s = this.cart.snapshot();
    const payload = { items: s.items.map(i => ({ foodId: i.item.id, qty: i.qty })), address: this.form.value.address as string };
    this.orders.create(payload).subscribe(order => 
      { this.cart.clear(); this.router.navigate(['/payment-status'], { queryParams: { orderId: order.id } }); });
  }
}
