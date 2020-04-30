package com.guidomaiola.ecommerce.productsService.service;

import com.guidomaiola.ecommerce.productsService.data.ProductSearchPageData;
import com.guidomaiola.ecommerce.productsService.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public Product getProductForCode(String productCode) {

        return new Product();
    }

    public ProductSearchPageData searchProducts(String query, int i, int i1, Object o) {
    }
}
