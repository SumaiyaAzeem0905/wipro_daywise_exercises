export interface Food {
  id: number;
  name: string;
  price: number;
  imageUrl: string;
  description: string;
  category: 'Pizza' | 'Burger' | 'Sushi' | 'Salad' | 'Beverage';
}