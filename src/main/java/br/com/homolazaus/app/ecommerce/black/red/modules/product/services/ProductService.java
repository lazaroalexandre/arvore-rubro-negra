package br.com.homolazaus.app.ecommerce.black.red.modules.product.services;

import br.com.homolazaus.app.ecommerce.black.red.modules.product.models.dtos.ProductDetailFilterDto;

public interface ProductService {
    ProductDetailFilterDto listProductsAbovePrice(double price);
    ProductDetailFilterDto listProductsBelowPrice(double price);
}
