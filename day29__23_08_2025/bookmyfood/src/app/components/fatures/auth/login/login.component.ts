import { CommonModule } from '@angular/common';
import { Component, inject } from '@angular/core';
import { FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { AuthService } from '../../../../services/auth.service';
import { LoginRequest } from '../../../../models/auth.model';

@Component({
  selector: 'app-login',
  imports: [CommonModule, ReactiveFormsModule, RouterLink],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
private fb = inject(FormBuilder);
  private auth = inject(AuthService);
  private router = inject(Router);
  form = this.fb.group({ username: ['', Validators.required], password: ['', Validators.required] });
  onSubmit() {
  if (this.form.invalid) return;
  const payload: LoginRequest = {
    username: this.form.value.username ?? '',
    password: this.form.value.password ?? ''
  };
  this.auth.login(payload).subscribe({
    next: () => this.router.navigateByUrl('/foods')
  });
}}
