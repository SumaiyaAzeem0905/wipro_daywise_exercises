import { CommonModule } from '@angular/common';
import { Component, inject } from '@angular/core';
import { OrderService } from '../../../../services/order.service';

@Component({
  selector: 'app-order-history',
  imports: [CommonModule],
  templateUrl: './order-history.component.html',
  styleUrl: './order-history.component.css'
})
export class OrderHistoryComponent {
private os = inject(OrderService); orders: any[] = []; ngOnInit() { this.os.mine().subscribe(r => this.orders = r); }
}
