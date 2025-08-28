import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHighlightstrikethru]'
})
export class HighlightstrikethruDirective {
constructor(private el: ElementRef) {
    this.el.nativeElement.style.backgroundColor = 'yellow';   // yellow highlight
    this.el.nativeElement.style.color = 'black';              // text in black
    this.el.nativeElement.style.textDecoration = 'line-through';

  }

}
