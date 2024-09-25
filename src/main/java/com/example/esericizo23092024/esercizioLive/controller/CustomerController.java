package com.example.esericizo23092024.esercizioLive.controller;

import com.example.esericizo23092024.esercizioLive.model.Customer;
import com.example.esericizo23092024.esercizioLive.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;



    @PostMapping()
    public ResponseEntity<Customer> createNewCustomer(@RequestBody Customer customer){

        Customer newCustomer = customerService.createNewCustomer(customer);
        return ResponseEntity.ok(newCustomer);
    }
/*
    @PatchMapping("/customer-name/{id}")
    public ResponseEntity<?> changeCustomerName(@PathVariable("id") Long id, @RequestParam("name") String name){
        if(customerMap.containsKey(id)){
            Customer customer = customerMap.get(id);
            customer.setName(name);
           return ResponseEntity.ok(customer);
        }
        return ResponseEntity.status(404).body("Customer not found");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteCustomer(@PathVariable("id") Long id){
       customerMap.remove(id);
        return ResponseEntity.ok(true);
    } */

}
