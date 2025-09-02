import { CartItem } from "./cart";

export interface Order {
  id?: number;
  items: CartItem[];
  totalAmount: number;
  status: 'Pending' | 'Confirmed' | 'Delivered';
  address: string;
  paymentMethod: 'COD' | 'Card' | 'UPI';
  createdAt: Date;
}