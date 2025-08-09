package com.exmple.NotificationService.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exmple.NotificationService.dto.UserDTO;

@RestController
@RequestMapping("/notify")
public class NotificationController {
	@PostMapping
    public String handleUserAction(@RequestBody UserDTO userActionDTO) {
        String action = userActionDTO.getAction();
        String username = userActionDTO.getUser().getUsername();

        System.out.println("Notification: User " + username + " has been " + action);

        return "Notification processed for action: " + action;
    }

}
