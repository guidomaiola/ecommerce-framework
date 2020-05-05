package com.guidomaiola.ecommerce.productsService.mapper;

import com.guidomaiola.ecommerce.productsService.dto.ProductWsDTO;
import com.guidomaiola.ecommerce.productsService.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    public ProductWsDTO map(Product product);

    public List<ProductWsDTO> map(List<Product> product);

}
