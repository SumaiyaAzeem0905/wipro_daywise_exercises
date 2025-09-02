import { inject, Injectable } from '@angular/core';
import { PaymentInfo } from '../models/payment.model';
import { ApiService } from './api.service';

@Injectable({
  providedIn: 'root'
})
export class PaymentService {
private api = inject(ApiService); initiate(payload: PaymentRequest) { return this.api.post<PaymentInfo>('/payments', payload); } byOrder(orderId: string) { return this.api.get<PaymentInfo>(`/payments/by-order/${orderId}`); }
}
