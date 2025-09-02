import { Component, OnInit } from '@angular/core';
import { Order } from '../../../models/order';
import { OrderService } from '../../../services/order.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-order',
  imports: [CommonModule],
  templateUrl: './order.component.html',
  styleUrl: './order.component.css'
})
export class OrderComponent implements OnInit{
orders: Order[] = [];

  constructor(private orderSvc: OrderService) {}

  ngOnInit(): void {
    this.orders = this.orderSvc.getOrders();
  }
}
