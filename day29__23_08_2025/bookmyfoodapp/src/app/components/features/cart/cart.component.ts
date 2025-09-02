import { Component, OnInit } from '@angular/core';
import { Cart, CartItem } from '../../../models/cart';
import { CartService } from '../../../services/cart.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-cart',
  imports: [CommonModule],
  templateUrl: './cart.component.html',
  styleUrl: './cart.component.css'
})
export class CartComponent implements OnInit{
cart!: Cart;

  constructor(private cartSvc: CartService) {}

  ngOnInit(): void {
    this.cart = this.cartSvc.getCart();
  }

  remove(id: number) {
    this.cartSvc.removeFromCart(id);
    this.cart = this.cartSvc.getCart();
  }
}
