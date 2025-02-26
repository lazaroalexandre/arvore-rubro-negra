package br.com.homolazaus.app.ecommerce.black.red.modules.product.repositories;

import java.util.TreeMap;

import br.com.homolazaus.app.ecommerce.black.red.modules.product.models.entities.ProductEntity;

public interface ProductRepository{
    TreeMap<Double, ProductEntity> findByPrice();   
}
