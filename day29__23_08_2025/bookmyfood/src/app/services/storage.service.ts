import { Injectable } from '@angular/core';
const ACCESS = 'access_token';
const REFRESH = 'refresh_token';
@Injectable({
  providedIn: 'root'
})

export class StorageService {

  setTokens(access: string, refresh?: string) { localStorage.setItem(ACCESS, access); if (refresh) localStorage.setItem(REFRESH, refresh); }
getAccessToken() { return localStorage.getItem(ACCESS) ?? ''; }
getRefreshToken() { return localStorage.getItem(REFRESH) ?? ''; }
clearTokens() { localStorage.removeItem(ACCESS); localStorage.removeItem(REFRESH); }

}
