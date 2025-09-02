import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CartService } from '../../../services/cart.service';

@Component({
  selector: 'app-payment',
  imports: [],
  templateUrl: './payment.component.html',
  styleUrl: './payment.component.css'
})
export class PaymentComponent {
constructor(private router: Router, private cartSvc: CartService) {}

  pay() {
    this.cartSvc.clear();
    this.router.navigate(['/orders']);
  }

}
