import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FoodDtailComponent } from './food-dtail.component';

describe('FoodDtailComponent', () => {
  let component: FoodDtailComponent;
  let fixture: ComponentFixture<FoodDtailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FoodDtailComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FoodDtailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
