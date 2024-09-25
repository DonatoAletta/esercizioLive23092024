package com.example.esericizo23092024.esercizioLive.model.dto;

import com.example.esericizo23092024.esercizioLive.model.Product;
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
