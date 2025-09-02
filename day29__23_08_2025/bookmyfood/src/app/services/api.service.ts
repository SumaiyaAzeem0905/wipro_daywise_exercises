import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private http = inject(HttpClient);
private base = environment.gatewayBaseUrl;
get<T>(url: string) {
  return this.http.get<T>(this.base + url, { observe: 'body' });
}

post<T>(url: string, body: any) {
  return this.http.post<T>(this.base + url, body, { observe: 'body' });
}

put<T>(path: string, body: any, options?: any) { return this.http.put<T>(`${this.base}${path}`, body, options); }
patch<T>(path: string, body: any, options?: any) { return this.http.patch<T>(`${this.base}${path}`, body, options); }
delete<T>(path: string, options?: any) { return this.http.delete<T>(`${this.base}${path}`, options); }
}
