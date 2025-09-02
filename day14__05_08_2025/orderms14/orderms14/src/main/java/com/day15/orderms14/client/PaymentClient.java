package com.day15.orderms14.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.day15.orderms14.dto.PaymentDto;

@FeignClient(name = "paymentClient", url = "${payment.service.url}")
public interface PaymentClient {
	@PostMapping("/payments")
    PaymentDto createPayment(@RequestBody PaymentDto payment);

    @GetMapping("/payments/by-order/{orderId}")
    PaymentDto getByOrderId(@PathVariable("orderId") Long orderId);
}
