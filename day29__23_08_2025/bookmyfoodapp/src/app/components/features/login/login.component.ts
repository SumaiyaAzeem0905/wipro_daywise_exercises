import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  imports: [FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
email: string = '';
  password: string = '';

  constructor(private router: Router) {}

  onLogin() {
    if (this.email === 'test@test.com' && this.password === '12345') {
      alert('Login successful!');
      this.router.navigate(['/home']);
    } else {
      alert('Invalid credentials!');
    }
  }
}
