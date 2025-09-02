import { CommonModule } from '@angular/common';
import { Component, inject } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PaymentService } from '../../../../services/payment.service';

@Component({
  selector: 'app-payment-status',
  imports: [CommonModule],
  templateUrl: './payment-status.component.html',
  styleUrl: './payment-status.component.css'
})
export class PaymentStatusComponent {
private route = inject(ActivatedRoute);
  private pay = inject(PaymentService);
  info: any;
  ngOnInit() { const orderId = this.route.snapshot.queryParamMap.get('orderId')!; this.pay.byOrder(orderId).subscribe(r => (this.info = r));
}}
