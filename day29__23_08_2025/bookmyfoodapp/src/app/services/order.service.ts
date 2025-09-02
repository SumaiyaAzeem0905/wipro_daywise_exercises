import { Injectable } from '@angular/core';
import { Order } from '../models/order';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

private orders: Order[] = [];

  getOrders(): Order[] {
    return this.orders;
  }

  placeOrder(order: Order): void {
    order.id = this.orders.length + 1;
    this.orders.push(order);
  }
}
