package br.com.homolazaus.app.ecommerce.black.red.modules.product.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductEntity {
    private String id;

    private String name;

    private String description;

    private int quantity;

    private double price;
}
