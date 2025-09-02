import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'palindrome-app';

    isPalindrome(str: string): boolean {
    if (!str) return false;
    const cleaned = str.replace(/\s+/g, '').toLowerCase();
    return cleaned === cleaned.split('').reverse().join('');
  }

}
