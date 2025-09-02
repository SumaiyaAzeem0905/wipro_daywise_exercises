import { Food } from "./food";

export interface CartItem {
  food: Food;
  quantity: number;
}

export interface Cart {
  items: CartItem[];
  totalPrice: number;
}