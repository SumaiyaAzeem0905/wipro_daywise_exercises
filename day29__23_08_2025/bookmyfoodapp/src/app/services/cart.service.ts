import { Injectable } from '@angular/core';
import { Cart, CartItem } from '../models/cart';
import { Food } from '../models/food';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  private cart: Cart = { items: [], totalPrice: 0 };

  getCart(): Cart {
    return this.cart;
  }

  addToCart(food: Food): void {
    const existing = this.cart.items.find(i => i.food.id === food.id);
    if (existing) existing.quantity++;
    else this.cart.items.push({ food, quantity: 1 });
    this.recalc();
  }

  removeFromCart(foodId: number): void {
    this.cart.items = this.cart.items.filter(i => i.food.id !== foodId);
    this.recalc();
  }

  clear(): void {
    this.cart = { items: [], totalPrice: 0 };
  }

  private recalc() {
    this.cart.totalPrice = this.cart.items
      .reduce((sum, i) => sum + i.food.price * i.quantity, 0);
  }
}
