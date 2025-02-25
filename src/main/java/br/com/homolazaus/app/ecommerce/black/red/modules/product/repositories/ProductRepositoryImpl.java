package br.com.homolazaus.app.ecommerce.black.red.modules.product.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.homolazaus.app.ecommerce.black.red.modules.product.models.entities.ProductEntity;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public NavigableMap<Double, List<ProductEntity>> findByPrice() {
        NavigableMap<Double, List<ProductEntity>> map = new TreeMap<>();

        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            String id = UUID.randomUUID().toString();
            String name = "Produto " + i;
            String description = "Descrição do produto " + i + ".";
            int quantity = random.nextInt(100);
            double price = 1 + 99 * random.nextDouble();
            map.computeIfAbsent(price, product -> new ArrayList<>())
                    .add(new ProductEntity(id, name, description, quantity, price));
        }

        return map;
    }

}
