import { FoodItem } from './food.model';
export interface CartItem { item: FoodItem; qty: number; }
export interface CartSnapshot { items: CartItem[]; total: number; }