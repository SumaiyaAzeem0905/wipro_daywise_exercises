import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-product-list',
  imports: [CommonModule],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css'
})
export class ProductListComponent implements OnInit{
products: Product[] = [];

  constructor(private service: ProductService, private router: Router) {}

  ngOnInit(): void {
    this.load();
  }

  load(): void {
    this.service.getProducts().subscribe(data => this.products = data);
  }

  delete(id: number): void {
    this.service.deleteProduct(id).subscribe(() => this.load());
  }

  edit(id: number): void {
    this.router.navigate(['/edit', id]);
  }
}
