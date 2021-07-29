package com.example.catalogservice.jpa;

import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository<CatalogEntitiy, Long> {
    CatalogEntitiy findByProductId(String productId);
}
