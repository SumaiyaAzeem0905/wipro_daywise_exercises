import { Component } from '@angular/core';
import { OrderService } from '../../../services/order.service';
import { Router } from '@angular/router';
import { Order } from '../../../models/order';
import { CartService } from '../../../services/cart.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-check-out',
  imports: [FormsModule,CommonModule],
  templateUrl: './check-out.component.html',
  styleUrl: './check-out.component.css'
})
export class CheckOutComponent {
address = '';
  paymentMethod: Order['paymentMethod'] = 'COD';

  constructor(
    private cartSvc: CartService,
    private orderSvc: OrderService,
    private router: Router
  ) {}

  place() {
    const cart = this.cartSvc.getCart();
    if (!cart.items.length || !this.address) {
      alert('Fill address and have at least 1 item.');
      return;
    }
    const order: Order = {
      items: cart.items,
      totalAmount: cart.totalPrice,
      status: 'Pending',
      address: this.address,
      paymentMethod: this.paymentMethod,
      createdAt: new Date()
    };
    this.orderSvc.placeOrder(order);
    this.router.navigate(['/payment']);
  }
}
