package com.example.thymeleafdemo.controller;


import com.example.thymeleafdemo.model.BankAccount;
import com.example.thymeleafdemo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {
	@GetMapping("/personView")
    public String showPerson(Model model) {
        // Build sample person with bank accounts
        Person p = new Person();
        p.setFirstName("Amit");
        p.setAdult(true);
        p.setSalary(75000.0);
        p.setBankAccounts(List.of(
                new BankAccount("1234567890","SBI"),
                new BankAccount("9876543210","HDFC")
        ));

        model.addAttribute("person", p); // pass to thymeleaf
        return "person"; // resolves to src/main/resources/templates/person.html
    }
}
