package com.example.catalogservice.service;

import com.example.catalogservice.jpa.CatalogEntitiy;

public interface CatalogService {
    Iterable<CatalogEntitiy> getAllCatalogs();
}
