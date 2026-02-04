package com.example.demo.services;

import com.example.demo.dto.ProductDTO;

public class FakeStoreProductService implements IProductService {
    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        return null;
    }
}
