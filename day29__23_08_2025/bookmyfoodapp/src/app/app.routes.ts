import { Routes } from '@angular/router';
import { HomeComponent } from './components/features/home/home.component';
import { FoodPageComponent } from './components/features/food-page/food-page.component';
import { CartComponent } from './components/features/cart/cart.component';
import { LoginComponent } from './components/features/login/login.component';
import { RegisterComponent } from './components/features/register/register.component';
import { CheckOutComponent } from './components/features/check-out/check-out.component';
import { OrderComponent } from './components/features/order/order.component';
import { PaymentComponent } from './components/features/payment/payment.component';

export const routes: Routes = [
   { path: '', component: HomeComponent },
  { path: 'menu', component: FoodPageComponent },
  { path: 'cart', component: CartComponent },
  { path: 'checkout', component: CheckOutComponent },
  { path: 'orders', component: OrderComponent },
  { path: 'payment', component: PaymentComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: '**', redirectTo: '' }
];
