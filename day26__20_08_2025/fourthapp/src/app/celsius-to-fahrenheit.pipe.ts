import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'celsiusToFahrenheit'
})
export class CelsiusToFahrenheitPipe implements PipeTransform {

  transform(value: number): string {
    if (isNaN(value)) return '';
    const fahrenheit = (value * 9/5) + 32;
    return `${fahrenheit}F`;
  }
}
