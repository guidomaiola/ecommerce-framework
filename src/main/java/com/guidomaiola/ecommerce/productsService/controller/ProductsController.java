package com.guidomaiola.ecommerce.productsService.controller;

import com.guidomaiola.ecommerce.productsService.data.ProductSearchPageData;
import com.guidomaiola.ecommerce.productsService.mapper.ProductMapper;
import com.guidomaiola.ecommerce.productsService.model.Product;
import com.guidomaiola.ecommerce.productsService.service.ProductService;
import com.guidomaiola.ecommerce.productsService.dto.ProductWsDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class ProductsController extends BaseController {

    @Resource
    private ProductService productService;

    @RequestMapping("/")
    public String hello() {
        return "Hello world!";
    }

    @RequestMapping(value = "/{productCode}", method = RequestMethod.GET)
    public ProductWsDTO getProductByCode(@PathVariable final String productCode) {
        return ProductMapper.INSTANCE.map(
                productService.getProductForCode(productCode)
        );
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public void searchProducts(@RequestParam(required = false) final String query) {
        final ProductSearchPageData result = productService.searchProducts(query, 0, 1, null);
//        setTotalCountHeader(response, result.getPagination());
    }

}
