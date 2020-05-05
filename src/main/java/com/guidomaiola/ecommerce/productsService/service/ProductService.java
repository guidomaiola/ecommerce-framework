package com.guidomaiola.ecommerce.productsService.service;

import com.guidomaiola.ecommerce.productsService.data.ProductSearchPageData;
import com.guidomaiola.ecommerce.productsService.model.Product;
import com.guidomaiola.ecommerce.productsService.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private IProductRepository productRepository;

    public List<Product> getAllProducts() {
        return new ArrayList<Product>();
    }

    public Product getProductForCode(String productCode) {
        return productRepository.findByCode(productCode);
    }

    public ProductSearchPageData searchProducts(String query, int page, int pageSize) {
        return new ProductSearchPageData();
    }
}