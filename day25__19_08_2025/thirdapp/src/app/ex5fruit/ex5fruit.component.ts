import { Component, EventEmitter, Input, Output } from '@angular/core';
import { IFruit } from './ifruit';


@Component({
  selector: 'app-ex5fruit',
  imports: [],
  templateUrl: './ex5fruit.component.html',
  styleUrl: './ex5fruit.component.css'
})
export class Ex5fruitComponent {
//  @Input() name!: string;
//   @Input() description!: string;
//   @Input() image!: string;

@Input() fruit!: IFruit;
 @Output() removeClick = new EventEmitter<string>(); 

  onRemove() {
    console.log("Remove clicked - " + this.fruit.name);
    this.removeClick.emit(this.fruit.name);
  }
}
