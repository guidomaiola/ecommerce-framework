package com.guidomaiola.ecommerce.productsService.repository;

import com.guidomaiola.ecommerce.productsService.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface IProductRepository extends ElasticsearchRepository<Product, String> {

    Product findByCode(String code);

    Page<Product> findByCategoryId(String categoryId);
}