package com.example.esericizo23092024.esercizioLive.services;

import com.example.esericizo23092024.esercizioLive.model.Order;
import com.example.esericizo23092024.esercizioLive.model.dto.CreateOrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Service

public class OrderServices {

    @Autowired
    CustomerService customerService;
    @Autowired
    ProductService productService;

    public Order createNewOrder(int customerId, CreateOrderDTO createorderdto) throws Exception {
        customerService.findByCustomerID(customerId);



    }

}
