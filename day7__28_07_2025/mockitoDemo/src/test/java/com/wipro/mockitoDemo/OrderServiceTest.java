package com.wipro.mockitoDemo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class OrderServiceTest {
	@Test
    public void testPlaceOrderMocked() {
        OrderService orderService = mock(OrderService.class);
        when(orderService.placeOrder("ORD-01")).thenReturn("successful");

        String result = orderService.placeOrder("ORD-01");
        assertEquals("successful", result);

        verify(orderService).placeOrder("ORD-01"); 
    }

}
