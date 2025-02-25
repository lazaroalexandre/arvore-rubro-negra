package br.com.homolazaus.app.ecommerce.black.red.modules.product.services;

import java.util.List;

import java.util.stream.Collectors;

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

        List<ProductEntity> filteredProducts = productRepository.findByPrice().stream()
                .filter(product -> product.getPrice() >= price).collect(Collectors.toList());

        long end = System.nanoTime();
        return new ProductDetailFilterDto(filteredProducts.size(), (end - start), filteredProducts);
    }

    @Override
    public ProductDetailFilterDto listProductsBelowPrice(double price) {
        long start = System.nanoTime();

        List<ProductEntity> filteredProducts = productRepository.findByPrice().stream()
                .filter(product -> product.getPrice() <= price).collect(Collectors.toList());

        long end = System.nanoTime();
        return new ProductDetailFilterDto(filteredProducts.size(), (end - start), filteredProducts);
    }

}
