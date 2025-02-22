package br.com.homolazaus.app.ecommerce.black.red.modules.product.models.dtos;

import br.com.homolazaus.app.ecommerce.black.red.modules.product.models.entities.ProductEntity;
import java.util.List;

public record ProductDetailFilterDto(
        int total,
        long nanoSeconds,
        List<ProductEntity> products) {
}
