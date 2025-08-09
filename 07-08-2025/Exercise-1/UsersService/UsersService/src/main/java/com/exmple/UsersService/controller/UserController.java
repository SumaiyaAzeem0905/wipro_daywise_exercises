package com.exmple.UsersService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.exmple.UsersService.dto.UserDTO;
import com.exmple.UsersService.entity.User;
import com.exmple.UsersService.repo.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	private final UserRepository userRepository;
	public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private final RestTemplate restTemplate = new RestTemplate();

    @PostMapping
    public User create(@RequestBody User user) {
        User saved = userRepository.save(user);
        notify(saved, "Created");
        return saved;
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        User updated = userRepository.save(user);
        notify(updated, "Updated");
        return updated;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        User user = userRepository.findById(id).orElseThrow();
        userRepository.delete(user);
        notify(user, "Deleted");
    }

    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }

    private void notify(User user, String action) {
        UserDTO dto = new UserDTO();
        dto.setUser(user);
        dto.setAction(action);
        restTemplate.postForObject("http://localhost:8082/notify", dto, String.class);
    }

}
