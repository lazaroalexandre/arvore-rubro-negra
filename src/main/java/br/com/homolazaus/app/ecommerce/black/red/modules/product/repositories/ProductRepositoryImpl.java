package br.com.homolazaus.app.ecommerce.black.red.modules.product.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.homolazaus.app.ecommerce.black.red.modules.product.models.entities.ProductEntity;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final TreeMap<Double, List<ProductEntity>> produtos;

    public ProductRepositoryImpl() {
        this.produtos = new TreeMap<>();
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            String id = UUID.randomUUID().toString();
            String name = "Produto " + i;
            String description = "Descrição do produto " + i + ".";
            int quantity = random.nextInt(100);
            double price = 11 + 99 * random.nextDouble();
            produtos.computeIfAbsent(price, k -> new ArrayList<>())
                    .add(new ProductEntity(id, name, description, quantity, price));
        }
    }
    @Override
    public TreeMap<Double, List<ProductEntity>> findByPrice() {
        return produtos; 
    }

}
