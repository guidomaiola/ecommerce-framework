package com.guidomaiola.ecommerce.productsService.mapper;

import com.guidomaiola.ecommerce.productsService.dto.ProductWsDTO;
import com.guidomaiola.ecommerce.productsService.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    public ProductWsDTO map(Product product);

}
