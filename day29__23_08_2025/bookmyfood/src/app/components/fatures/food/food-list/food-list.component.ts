import { CommonModule } from '@angular/common';
import { Component, inject } from '@angular/core';
import { RouterLink } from '@angular/router';
import { FoodService } from '../../../../services/food.service';
import { CartService } from '../../../../services/cart.service';

@Component({
  selector: 'app-food-list',
  imports: [CommonModule,RouterLink],
  templateUrl: './food-list.component.html',
  styleUrl: './food-list.component.css'
})
export class FoodListComponent {
private food = inject(FoodService);
  private cart = inject(CartService);
  foods: any[] = [];
  ngOnInit() { this.food.list().subscribe(r => this.foods = r); }
  add(f: any) { this.cart.add(f, 1); }
}
