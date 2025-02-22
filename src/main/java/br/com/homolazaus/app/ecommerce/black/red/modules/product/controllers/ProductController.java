package br.com.homolazaus.app.ecommerce.black.red.modules.product.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.homolazaus.app.ecommerce.black.red.modules.product.models.dtos.ProductDetailFilterDto;
import br.com.homolazaus.app.ecommerce.black.red.modules.product.services.ProductService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    @GetMapping("/above-price/{price}")
    public ProductDetailFilterDto getAllProductsAbovePrice(@PathVariable double price){
        return productService.listProductsAbovePrice(price);
    }

    @GetMapping("/below-price/{price}")
    public ProductDetailFilterDto getAllProductsBelowPrice(@PathVariable double price){
        return productService.listProductsBelowPrice(price);
    }
}
