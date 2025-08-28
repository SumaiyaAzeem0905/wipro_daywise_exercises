import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-switchdemo',
  imports: [FormsModule],
  templateUrl: './switchdemo.component.html',
  styleUrl: './switchdemo.component.css'
})
export class SwitchdemoComponent {
color: string = 'default'; 
}
