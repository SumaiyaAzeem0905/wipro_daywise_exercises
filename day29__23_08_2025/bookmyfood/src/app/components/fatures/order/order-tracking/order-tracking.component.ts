import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-order-tracking',
  imports: [CommonModule],
  templateUrl: './order-tracking.component.html',
  styleUrl: './order-tracking.component.css'
})
export class OrderTrackingComponent {
 @Input() orderId!: string; status = 'CREATED'; private src?: EventSource;
  ngOnInit() { try { this.src = new EventSource(`/orders/${this.orderId}/events`); this.src.onmessage = e => (this.status = JSON.parse(e.data).status); } catch { } }
  ngOnDestroy() { this.src?.close(); }
}
