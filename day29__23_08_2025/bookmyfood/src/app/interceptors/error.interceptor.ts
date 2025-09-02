import { HttpErrorResponse, HttpInterceptorFn } from '@angular/common/http';
import { inject } from '@angular/core';
import { Router } from '@angular/router';
import { throwError } from 'rxjs/internal/observable/throwError';
import { catchError } from 'rxjs/internal/operators/catchError';

export const errorInterceptor: HttpInterceptorFn = (req, next) => {
  const router = inject(Router);
return next(req).pipe(
catchError((err: HttpErrorResponse) => {
if (err.status === 401) router.navigate(['/login']);
return throwError(() => err);
})
);
};
