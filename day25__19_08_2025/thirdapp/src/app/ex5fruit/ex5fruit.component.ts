import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-ex5fruit',
  imports: [],
  templateUrl: './ex5fruit.component.html',
  styleUrl: './ex5fruit.component.css'
})
export class Ex5fruitComponent {
 @Input() name!: string;
  @Input() description!: string;
  @Input() image!: string;
}
