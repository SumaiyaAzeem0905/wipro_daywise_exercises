import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { StorageService } from '../services/storage.service';

export const authGuard: CanActivateFn = (route, state) => {
 const storage = inject(StorageService);
  const router = inject(Router);

  if (storage.getAccessToken()) {
    return true;
  }

  router.navigate(['/login']);
  return false;
};
