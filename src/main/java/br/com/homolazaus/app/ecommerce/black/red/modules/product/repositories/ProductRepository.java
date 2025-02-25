package br.com.homolazaus.app.ecommerce.black.red.modules.product.repositories;

import java.util.List;
import java.util.NavigableMap;

import br.com.homolazaus.app.ecommerce.black.red.modules.product.models.entities.ProductEntity;

public interface ProductRepository{
    NavigableMap<Double, List<ProductEntity>> findByPrice();   
}
