import { Routes } from '@angular/router';
import { authGuard } from './guards/auth.guard';

export const routes: Routes = [
     { path: '', redirectTo: 'foods', pathMatch: 'full' },
  { path: 'foods', loadComponent: () => import('./components/fatures/food/food-list/food-list.component').then(m => m.FoodListComponent) },
  { path: 'cart', loadComponent: () => import('./components/fatures/cart/cart/cart.component').then(m => m.CartComponent) },
  { path: 'login', loadComponent: () => import('./components/fatures/auth/login/login.component').then(m => m.LoginComponent) },
  { path: 'register', loadComponent: () => import('./components/fatures/auth/register/register.component').then(m => m.RegisterComponent) },
  { path: 'profile', canActivate: [authGuard], loadComponent: () => import('./components/fatures/auth/profile/profile.component').then(m => m.ProfileComponent) },
  { path: 'checkout', canActivate: [authGuard], loadComponent: () => import('./components/fatures/order/check-out/check-out.component').then(m => m.CheckOutComponent) },
  { path: 'orders', canActivate: [authGuard], loadComponent: () => import('./components/fatures/order/order-history/order-history.component').then(m => m.OrderHistoryComponent) },
  { path: 'payment-status', canActivate: [authGuard], loadComponent: () => import('./components/fatures/payment/payment-status/payment-status.component').then(m => m.PaymentStatusComponent) },
  { path: '**', redirectTo: 'foods' }
];
