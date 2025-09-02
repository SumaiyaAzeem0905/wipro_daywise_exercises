import { inject, Injectable } from '@angular/core';
import { ApiService } from './api.service';
import { FoodItem } from '../models/food.model';

@Injectable({
  providedIn: 'root'
})
export class FoodService {

private api = inject(ApiService); list() { return this.api.get<FoodItem[]>('/foods'); } byId(id: string) { return this.api.get<FoodItem>(`/foods/${id}`); }
}
