import { Component, inject } from '@angular/core';
import { FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';
import { AuthService } from '../../../../services/auth.service';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { RegisterRequest } from '../../../../models/auth.model';

@Component({
  selector: 'app-register',
  imports: [CommonModule,ReactiveFormsModule],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {
private fb = inject(FormBuilder);
  private auth = inject(AuthService);
  private router = inject(Router);
  form = this.fb.group({
    username: ['', Validators.required],
    email: ['', [Validators.required, Validators.email]],
    password: ['', [Validators.required, Validators.minLength(6)]]
  });
  onSubmit() {
  if (this.form.invalid) return;
  const payload: RegisterRequest = {
    username: this.form.value.username ?? '',
    email: this.form.value.email ?? '',
    password: this.form.value.password ?? ''
  };
  this.auth.register(payload).subscribe({
    next: () => this.router.navigateByUrl('/login')
  });
}
}
