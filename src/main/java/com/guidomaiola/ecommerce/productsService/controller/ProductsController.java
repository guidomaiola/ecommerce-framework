package com.guidomaiola.ecommerce.productsService.controller;

import com.guidomaiola.ecommerce.productsService.data.ProductSearchPageData;
import com.guidomaiola.ecommerce.productsService.dto.ProductWsDTO;
import com.guidomaiola.ecommerce.productsService.mapper.ProductMapper;
import com.guidomaiola.ecommerce.productsService.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/product")
@Api(value = "Language API", description = "Operations pertaining to Language")
public class ProductsController extends BaseController {

    @Resource
    private ProductService productService;

    @ApiOperation(value = "View a list of available languages", response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<ProductWsDTO> getAllProducts() {
        return ProductMapper.INSTANCE.map(
                productService.getAllProducts()
        );
    }

    @RequestMapping(value = "/{productCode}", method = RequestMethod.GET)
    public ProductWsDTO getProductByCode(@PathVariable final String productCode) {
        return ProductMapper.INSTANCE.map(
                productService.getProductForCode(productCode)
        );
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public void searchProducts(@RequestParam(required = false) final String query) {
        final ProductSearchPageData result = productService.searchProducts(query, 0, 1);
//        setTotalCountHeader(response, result.getPagination());
    }

}
