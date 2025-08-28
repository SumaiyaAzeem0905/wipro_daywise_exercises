import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { ConditionalcompComponent } from './conditionalcomp/conditionalcomp.component';
import { CountryListComponent } from './country-list/country-list.component';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';
import { SearchfilterComponent } from './searchfilter/searchfilter.component';
import { Ex15HomeComponent } from './ex15-home/ex15-home.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,FormsModule,Ex15HomeComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'secondapp'
  name: string = 'Sumaiya'
  printName() {
    console.log("Entered Name:", this.name);
    alert("You entered: " + this.name);
  };
  nameList: string[] = ['Sumaiya', 'Ayesha', 'Azeem', 'Lalkot', 'Sneha'];

}
