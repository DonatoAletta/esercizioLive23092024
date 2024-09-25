package com.example.esericizo23092024.esercizioLive.services;

import com.example.esericizo23092024.esercizioLive.entity.Customer;
import com.example.esericizo23092024.esercizioLive.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;


@Service
public class CustomerService {

    //Map<Long, Customer> customerMap = new HashMap<>();
    AtomicLong customerId = new AtomicLong();

    @Autowired
    CustomerRepository customerRepository;

    public Customer createNewCustomer(Customer customer){
        customer.setId(customerId.incrementAndGet());
        customerMap.put(customer.getId(), customer);
        return customer;
    }

 public Customer findByCustomerID (Long customerId) throws Exception {
        return customerRepository.findById(customerId).orElseThrow(()-> new Exception("Customer not found"));
 }

}
