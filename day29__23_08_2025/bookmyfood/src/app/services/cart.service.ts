import { computed, Injectable, signal } from '@angular/core';
import { CartItem, CartSnapshot } from '../models/cart.model';

@Injectable({
  providedIn: 'root'
})
export class CartService {
private itemsSig = signal<CartItem[]>([]);
items = computed(() => this.itemsSig());
total = computed(() => this.itemsSig().reduce((s, c) => s + c.item.price * c.qty, 0));
add(item: CartItem['item'], qty = 1) { const f = this.itemsSig().find(c => c.item.id === item.id); if (f) f.qty += qty; else this.itemsSig.update(a => [...a, { item, qty }]); }
remove(foodId: string) { this.itemsSig.update(a => a.filter(c => c.item.id !== foodId)); }
clear() { this.itemsSig.set([]); }
snapshot(): CartSnapshot { return { items: this.itemsSig(), total: this.total() }; }
}
