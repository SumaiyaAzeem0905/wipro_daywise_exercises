export type PaymentStatus = 'INITIATED' | 'SUCCESS' | 'FAILED';
export interface PaymentRequest { orderId: string; method: 'CARD' | 'UPI' | 'COD'; }
export interface PaymentInfo { id: string; orderId: string; status: PaymentStatus; reference?: string; }