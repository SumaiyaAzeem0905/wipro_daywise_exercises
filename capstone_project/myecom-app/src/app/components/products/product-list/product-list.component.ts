import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, RouterLink } from '@angular/router';
import { ProductService } from '../../../services/product.service';
import { CartService } from '../../../services/cart.service';

@Component({
  selector: 'app-product-list',
  imports: [CommonModule,RouterLink],
  templateUrl: './product-list.component.html',
  styleUrl: './product-list.component.css'
})
export class ProductListComponent implements OnInit {
// product-list.component.ts (excerpt)
categories = [
           { name: 'Electronics', img: 'https://tse2.mm.bing.net/th/id/OIP.CbHx8--ypUqshR0R7TylYAAAAA?rs=1&pid=ImgDetMain&o=7&rm=3' },
  { name: 'Fashion',     img: 'https://marketplace.canva.com/EAFGKRRskMs/1/0/800w/canva-brown-and-beige-minimalist-fashion-banner-B_78un9z_LQ.jpg' },
  { name: 'Home',        img: 'https://images.unsplash.com/photo-1505691938895-1758d7feb511?auto=format&fit=crop&w=800&q=60' },
  { name: 'Books',       img: 'https://images.unsplash.com/photo-1512820790803-83ca734da794?auto=format&fit=crop&w=800&q=60' },
  { name: 'Sports',      img: 'https://images.unsplash.com/photo-1517649763962-0c623066013b?auto=format&fit=crop&w=800&q=60' },
  { name: 'Footwear',     img: 'https://images.hindustantimes.com/rf/image_size_960x540/HT/p2/2018/05/13/Pictures/collection-of-female-shoes-on-wooden-floor_d426d1c6-566d-11e8-ae13-d985d3701f4e.jpg' },
  { name: 'Accessories', img: 'https://hips.hearstapps.com/hmg-prod/images/set-of-fashion-collection-with-trendy-fashion-royalty-free-image-1730393789.jpg?crop=0.668xw:1.00xh;0.167xw,0&resize=1120:*' },
  { name: 'Kitchen',     img: 'https://png.pngtree.com/thumb_back/fh260/background/20231030/pngtree-eco-conscious-kitchen-essentials-crafted-from-sustainable-materials-on-a-wooden-image_13774670.png' },
  { name: 'Beauty',      img: 'https://media.istockphoto.com/id/1221677097/photo/make-up-cosmetics-products-against-pink-color-background.jpg?b=1&s=170667a&w=0&k=20&c=C3sbcRcACM5E7sxFkON61OR5qqFvm8gHs8vwsFN6Nuc=' },
  { name: 'Toys',        img: 'https://static.vecteezy.com/system/resources/previews/028/535/150/non_2x/a-myriad-of-vibrant-toys-carefully-curated-and-proudly-displayed-generative-ai-photo.jpg' },
  { name: 'Furniture',   img: 'https://assets.weimgs.com/weimgs/ab/images/wcm/products/202237/0042/andes-3-piece-ottoman-sectional-90-105-fwh.jpg' },
  {
    name: 'Kids Fashion',
    img: 'https://businessideaai.com/wp-content/uploads/2023/07/20230709_110909.jpg'
  }
          
];


  products: any[] = [];
  category: string | null = null;
  loading = false;
  error: string | null = null;

  constructor(
    private productService: ProductService,
    private cartService: CartService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.route.queryParamMap.subscribe(params => {
      const cat = params.get('category');
      this.category = cat;
      if (cat) {
        this.loadProductsForCategory(cat);
      } else {
        // show categories grid (products list emptied)
        this.products = [];
      }
    });
  }

  loadProductsForCategory(cat: string) {
  this.loading = true;
  this.error = null;

  this.productService.getAll().subscribe({
    next: (res: any[]) => {
      if (!res || res.length === 0) {
        this.products = [];
      } else {
        // ✅ Ensure we filter products by category (case-insensitive)
        this.products = res.filter(p =>
  (p.category || '').trim().toLowerCase() === cat.trim().toLowerCase()
);
      }
      this.loading = false;
    },
    error: (err) => {
      console.error(err);
      this.error = 'Failed to load products.';
      this.loading = false;
    }
  });
}


  backToCategories() {
  this.router.navigate(['/products']);
}

  addToCart(p: any) {
    if (p.quantity !== undefined && p.stock <= 0) {
      alert('Out of stock');
      return;
    }
    this.cartService.add(p, 1);
    alert('Added to cart');
  }

}
