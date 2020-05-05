package com.guidomaiola.ecommerce.productsService.repository;

import com.guidomaiola.ecommerce.productsService.model.ProductType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductTypeRepository extends CrudRepository<ProductType, String> {

    ProductType findByCode(String code);

    ProductType findByName(String name);

    List<ProductType> findAll();
}