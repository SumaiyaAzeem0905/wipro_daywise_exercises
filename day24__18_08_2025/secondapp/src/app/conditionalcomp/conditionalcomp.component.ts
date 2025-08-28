import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-conditionalcomp',
  imports: [FormsModule],
  templateUrl: './conditionalcomp.component.html',
  styleUrl: './conditionalcomp.component.css'
})
export class ConditionalcompComponent {
   showMessage: boolean = false;

}
