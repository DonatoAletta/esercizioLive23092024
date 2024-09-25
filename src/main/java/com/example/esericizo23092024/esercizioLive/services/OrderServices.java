package com.example.esericizo23092024.esercizioLive.services;

import com.example.esericizo23092024.esercizioLive.entity.Order;
import com.example.esericizo23092024.esercizioLive.dto.CreateOrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class OrderServices {

    @Autowired
    CustomerService customerService;
    @Autowired
    ProductService productService;

    public Order createNewOrder(Long customerId, CreateOrderDTO createorderdto) throws Exception {
        customerService.findByCustomerID(customerId);
        productService
    }

}
