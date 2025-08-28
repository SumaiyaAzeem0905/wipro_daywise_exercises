import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { CelsiusToFahrenheitPipe } from './celsius-to-fahrenheit.pipe';
import { HighlightstrikethruDirective } from './highlightstrikethru.directive';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,HighlightstrikethruDirective],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  //inputText: string = '';

  //selectedDate: string = '';

  // celsius: number = 0;
}
