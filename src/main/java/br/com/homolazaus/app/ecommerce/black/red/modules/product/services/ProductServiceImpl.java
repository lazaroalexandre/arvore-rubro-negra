package br.com.homolazaus.app.ecommerce.black.red.modules.product.services;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;

import org.springframework.stereotype.Service;

import br.com.homolazaus.app.ecommerce.black.red.modules.product.models.dtos.ProductDetailFilterDto;
import br.com.homolazaus.app.ecommerce.black.red.modules.product.models.entities.ProductEntity;
import br.com.homolazaus.app.ecommerce.black.red.modules.product.repositories.ProductRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public ProductDetailFilterDto listProductsAbovePrice(double price) {
        long start = System.nanoTime();

        NavigableMap<Double, List<ProductEntity>> filterMap = productRepository.findByPrice().tailMap(price, true);
        List<ProductEntity> list = new ArrayList<>();
        filterMap.values().forEach(list::addAll);

        long end = System.nanoTime();
        return new ProductDetailFilterDto(list.size(), (end - start), list);
    }

    @Override
    public ProductDetailFilterDto listProductsBelowPrice(double price) {
        long start = System.nanoTime();

        NavigableMap<Double, List<ProductEntity>> filterMap = productRepository.findByPrice().headMap(price, true);
        List<ProductEntity> list = new ArrayList<>();
        filterMap.values().forEach(list::addAll);

        long end = System.nanoTime();
        return new ProductDetailFilterDto(list.size(), (end - start), list);
    }

}