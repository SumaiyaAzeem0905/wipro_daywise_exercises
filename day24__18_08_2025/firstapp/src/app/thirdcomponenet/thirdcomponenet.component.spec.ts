import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ThirdcomponenetComponent } from './thirdcomponenet.component';

describe('ThirdcomponenetComponent', () => {
  let component: ThirdcomponenetComponent;
  let fixture: ComponentFixture<ThirdcomponenetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ThirdcomponenetComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ThirdcomponenetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
