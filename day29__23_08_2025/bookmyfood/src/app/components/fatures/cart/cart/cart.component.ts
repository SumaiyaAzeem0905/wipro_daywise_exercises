import { CommonModule } from '@angular/common';
import { Component, inject } from '@angular/core';
import { RouterLink } from '@angular/router';
import { CartService } from '../../../../services/cart.service';

@Component({
  selector: 'app-cart',
  imports: [CommonModule,RouterLink],
  templateUrl: './cart.component.html',
  styleUrl: './cart.component.css'
})
export class CartComponent {
cart = inject(CartService); remove(id: string) { this.cart.remove(id); }
}
