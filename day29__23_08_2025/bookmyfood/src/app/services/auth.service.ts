import { inject, Injectable, signal } from '@angular/core';
import { ApiService } from './api.service';
import { AuthPayload, LoginRequest, RegisterRequest } from '../models/auth.model';
import { tap } from 'rxjs/internal/operators/tap';
import { StorageService } from './storage.service';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

private api = inject(ApiService);
private storage = inject(StorageService);
user = signal<AuthPayload['user'] | null>(null);
isLoggedIn = signal<boolean>(false);


login(payload: LoginRequest) { return this.api.post<AuthPayload>('/auth/login', payload).pipe(tap(res => this.afterAuth(res))); }
register(payload: RegisterRequest) { return this.api.post<AuthPayload>('/auth/register', payload).pipe(tap(res => this.afterAuth(res))); }
me() { 
  return this.api.get<AuthPayload['user']>('/auth/me'); }
logout() { 
  this.storage.clearTokens(); this.user.set(null); this.isLoggedIn.set(false); }
private afterAuth(res: AuthPayload) { 
  this.storage.setTokens(res.tokens.accessToken, res.tokens.refreshToken); this.user.set(res.user); this.isLoggedIn.set(true); }
}
