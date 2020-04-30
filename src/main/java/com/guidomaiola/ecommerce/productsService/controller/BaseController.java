package com.guidomaiola.ecommerce.productsService.controller;

import com.guidomaiola.ecommerce.productsService.mapper.AbstractDataMapper;

public class BaseController {

    AbstractDataMapper mapper;

    protected AbstractDataMapper getDataMapper() {
        return mapper;
    }
}
