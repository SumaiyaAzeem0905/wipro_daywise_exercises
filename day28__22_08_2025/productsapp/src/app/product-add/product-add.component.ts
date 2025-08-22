import { Component } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-product-add',
  imports: [FormsModule,CommonModule],
  templateUrl: './product-add.component.html',
  styleUrl: './product-add.component.css'
})
export class ProductAddComponent {
product: Product = { id: 0, name: '', category: '', price: 0 };

  constructor(private service: ProductService, private router: Router) {}

  addProduct(): void {
    // let JSON-Server create the id
    const { id, ...payload } = this.product as any;
    this.service.addProduct(payload as Product).subscribe(() => {
      this.router.navigate(['/']);
    });
  }
}
