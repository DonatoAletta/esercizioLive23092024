package com.example.esericizo23092024.esercizioLive.dto;

import com.example.esericizo23092024.esercizioLive.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderDTO {

    List<Product> productsList;
    int quantity;

}
