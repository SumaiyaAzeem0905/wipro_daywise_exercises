import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { VehicleComponentComponent } from './vehicle-component/vehicle-component.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,VehicleComponentComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'fifthapp';
}
