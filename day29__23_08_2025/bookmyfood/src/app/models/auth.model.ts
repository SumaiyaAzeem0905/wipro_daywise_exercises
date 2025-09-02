export interface LoginRequest { username: string; password: string; }
export interface RegisterRequest { username: string; email: string; password: string; }
export interface AuthTokens { accessToken: string; refreshToken?: string; }
export interface AuthPayload { user: import('./user.model').User; tokens: AuthTokens; }