package edu.iit.controller;

import edu.iit.dto.Customer;
import edu.iit.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor

public class CustomerController {

    @Autowired
    CustomerService service;

    CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/get-customer")
    public Customer getCustomer() {
        return new Customer(1,"saman","colobo", "saman@gmail.com");
    }

    @PostMapping("/add-customer")
    public void addCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }
}
