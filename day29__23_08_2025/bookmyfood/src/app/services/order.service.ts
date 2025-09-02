import { inject, Injectable } from '@angular/core';
import { ApiService } from './api.service';
import { CreateOrderRequest, OrderSummary } from '../models/order.model';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
private api = inject(ApiService);
create(payload: CreateOrderRequest) { return this.api.post<OrderSummary>('/orders', payload); }
getById(id: string) { return this.api.get<OrderSummary>(`/orders/${id}`); }
mine() { return this.api.get<OrderSummary[]>('/orders/me'); }
}
