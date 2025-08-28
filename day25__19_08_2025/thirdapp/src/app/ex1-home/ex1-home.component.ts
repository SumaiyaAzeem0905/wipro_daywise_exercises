import { Component } from '@angular/core';
import { Ex1DisplayListComponent } from '../ex1-display-list/ex1-display-list.component';
import { Ex5fruitComponent } from '../ex5fruit/ex5fruit.component';
import { CommonModule } from '@angular/common';
import { IFruit } from '../ex5fruit/ifruit';


@Component({
  selector: 'app-ex1-home',
  imports: [CommonModule,Ex5fruitComponent],
  templateUrl: './ex1-home.component.html',
  styleUrl: './ex1-home.component.css'
})
export class Ex1HomeComponent {
    fruits: IFruit[] = [
    {
      name: 'Apple',
      description: 'Apples are sweet and crunchy.',
      image: 'https://tse2.mm.bing.net/th/id/OIP.M5ul8Wn8FsDEB_NbK5agUwHaIZ?pid=Api&P=0&h=220'
    },
    {
      name: 'Banana',
      description: 'Bananas are rich in potassium.',
      image: 'https://tse2.mm.bing.net/th/id/OIP.O8lKDwWSZP_Cfm8eeyw3wAHaFu?pid=Api&P=0&h=220'
    },

    {
      name: 'Orange',
      description: 'Oranges are juicy and full of Vitamin C.',
      image: 'https://tse4.mm.bing.net/th/id/OIP.IczbWs4l14PlArRhA9Nu8gHaJ6?pid=Api&P=0&h=220'
    },
    {
  name: 'Mango',
  description: 'Mangoes are called the king of fruits, sweet and tropical.',
  image: 'https://upload.wikimedia.org/wikipedia/commons/9/90/Hapus_Mango.jpg'
},
{
  name: 'Strawberry',
  description: 'Strawberries are red, juicy, and perfect for desserts.',
  image: 'https://upload.wikimedia.org/wikipedia/commons/2/29/PerfectStrawberry.jpg'
},
{
  name: 'Pineapple',
  description: 'Pineapples are tangy, tropical, and refreshing.',
  image: 'https://upload.wikimedia.org/wikipedia/commons/c/cb/Pineapple_and_cross_section.jpg'
}
    
  ];

  removeFruit(fruitName: string) {
    console.log("Parent removing - " + fruitName);
    this.fruits = this.fruits.filter(f => f.name !== fruitName);
  }
}
