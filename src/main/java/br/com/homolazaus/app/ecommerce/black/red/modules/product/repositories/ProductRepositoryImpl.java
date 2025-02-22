package br.com.homolazaus.app.ecommerce.black.red.modules.product.repositories;

import java.util.Random;
import java.util.TreeMap;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.homolazaus.app.ecommerce.black.red.modules.product.models.entities.ProductEntity;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public TreeMap<Double, ProductEntity> findByPrice() {
        TreeMap<Double, ProductEntity> map = new TreeMap<>();

        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            String id = UUID.randomUUID().toString();
            String name = "Produto " + i;
            String description = "Descrição do produto " + i + ".";
            int quantity = random.nextInt(100);
            double price = 1 + 99 * random.nextDouble();
            map.put(price, new ProductEntity(id, name, description, quantity, price));
        }

        return map;
    }

}
