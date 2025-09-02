import { Injectable } from '@angular/core';
import { Food } from '../models/food';

@Injectable({
  providedIn: 'root'
})
export class FoodService {
private foods: Food[] = [
    {
      id: 1,
      name: 'Margherita Pizza',
      price: 279,
      imageUrl: 'https://cdn.pixabay.com/photo/2017/12/09/08/18/pizza-3007395_640.jpg',
      description: 'Classic cheese & tomato pizza.',
      category: 'Pizza'
    },
    {
      id: 2,
      name: 'Pepperoni Pizza',
      price: 349,
      imageUrl: 'https://cdn.pixabay.com/photo/2018/06/18/16/05/pizza-3484647_640.jpg',
      description: 'Loaded with spicy pepperoni slices.',
      category: 'Pizza'
    },
    {
      id: 3,
      name: 'Cheese Burger',
      price: 159,
      imageUrl: 'https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_640.jpg',
      description: 'Juicy patty with melted cheese.',
      category: 'Burger'
    },
    {
      id: 4,
      name: 'Veggie Burger',
      price: 139,
      imageUrl: 'https://cdn.pixabay.com/photo/2017/01/22/19/20/hamburger-2009869_640.jpg',
      description: 'Crispy veg patty with fresh veggies.',
      category: 'Burger'
    },
    {
      id: 5,
      name: 'California Roll',
      price: 229,
      imageUrl: 'https://cdn.pixabay.com/photo/2017/06/02/18/24/sushi-2364317_640.jpg',
      description: 'Crab & avocado rolled sushi.',
      category: 'Sushi'
    },
    {
      id: 6,
      name: 'Greek Salad',
      price: 149,
      imageUrl: 'https://cdn.pixabay.com/photo/2016/03/05/21/46/greek-salad-1238648_640.jpg',
      description: 'Feta, olives, cucumber & tomatoes.',
      category: 'Salad'
    },
    {
      id: 7,
      name: 'Cold Coffee',
      price: 119,
      imageUrl: 'https://cdn.pixabay.com/photo/2016/11/29/04/59/beverage-1869598_640.jpg',
      description: 'Iced coffee with cream.',
      category: 'Beverage'
    }
  ];

  getAllFoods(): Food[] {
    return this.foods;
  }

  getByCategory(category: Food['category']): Food[] {
    return this.foods.filter(f => f.category === category);
  }
}
