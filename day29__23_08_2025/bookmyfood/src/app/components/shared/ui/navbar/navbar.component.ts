import { Component, inject } from '@angular/core';
import { AuthService } from '../../../../services/auth.service';
import { Router, RouterLink } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-navbar',
  imports: [CommonModule,RouterLink],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent {
auth = inject(AuthService);
  private router = inject(Router);
  logout() { this.auth.logout(); this.router.navigateByUrl('/'); }
}
