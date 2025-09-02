import { HttpInterceptorFn } from '@angular/common/http';
import { inject } from '@angular/core';
import { StorageService } from '../services/storage.service';

export const authInterceptor: HttpInterceptorFn = (req, next) => {
  const token = inject(StorageService).getAccessToken();
const isHttp = req.url.startsWith('http') || req.url.startsWith('/');
const headers = token && isHttp ? req.headers.set('Authorization', `Bearer ${token}`) : req.headers;
return next(req.clone({ headers }));
};
