import { TestBed } from '@angular/core/testing';
import { AppComponent } from './app.component';

describe('AppComponent', () => {
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AppComponent],
    }).compileComponents();
  });
  it('should return true for a palindrome word', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.isPalindrome('madam')).toBeTrue();
  });

  it('should return false for a non-palindrome word', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.isPalindrome('hello')).toBeFalse();
  });

  it('should ignore case and spaces while checking palindrome', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.isPalindrome('A man a plan a canal Panama')).toBeTrue();
  });
});
