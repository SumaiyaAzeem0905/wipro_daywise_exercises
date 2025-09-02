import { Component, OnInit } from '@angular/core';
import { Food } from '../../../models/food';
import { FoodService } from '../../../services/food.service';
import { CommonModule } from '@angular/common';
import { CartService } from '../../../services/cart.service';

@Component({
  selector: 'app-food-page',
  imports: [CommonModule],
  templateUrl: './food-page.component.html',
  styleUrl: './food-page.component.css'
})
export class FoodPageComponent implements OnInit{
foods: Food[] = [];
  categories: Food['category'][] = ['Pizza','Burger','Sushi','Salad','Beverage'];
  activeCategory: Food['category'] | 'All' = 'All';

  constructor(private foodSvc: FoodService, private cartSvc: CartService) {}

  ngOnInit(): void {
    this.foods = this.foodSvc.getAllFoods();
  }

  setCat(cat: Food['category'] | 'All') { this.activeCategory = cat; }

  list(): Food[] {
    if (this.activeCategory === 'All') return this.foods;
    return this.foods.filter(f => f.category === this.activeCategory);
  }

  add(food: Food) { this.cartSvc.addToCart(food); }
}
