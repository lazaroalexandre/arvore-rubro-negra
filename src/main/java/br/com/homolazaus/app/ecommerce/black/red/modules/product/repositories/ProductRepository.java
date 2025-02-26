package br.com.homolazaus.app.ecommerce.black.red.modules.product.repositories;

import java.util.List;

import br.com.homolazaus.app.ecommerce.black.red.modules.product.models.entities.ProductEntity;

public interface ProductRepository{
    List<ProductEntity> findByPrice();   
}
