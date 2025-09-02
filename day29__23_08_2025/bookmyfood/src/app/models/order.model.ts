export type OrderStatus = 'CREATED' | 'PENDING_PAYMENT' | 'PAID' | 'FAILED' | 'CANCELLED' | 'COMPLETED';
export interface OrderSummary { id: string; userId: string; amount: number; status: OrderStatus; createdAt: string; }
export interface CreateOrderRequest { items: { foodId: string; qty: number }[]; address: string; }