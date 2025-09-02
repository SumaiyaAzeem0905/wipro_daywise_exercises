import { Injectable } from '@angular/core';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private users: User[] = [];
  private currentUser: User | null = null;

  register(user: User) {
    user.id = this.users.length + 1;
    this.users.push(user);
  }

  login(email: string, password: string): boolean {
    const u = this.users.find(x => x.email === email && x.password === password);
    this.currentUser = u || null;
    return !!u;
  }

  logout() { this.currentUser = null; }
  me() { return this.currentUser; }
}
