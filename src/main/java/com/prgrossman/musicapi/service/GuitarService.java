package com.prgrossman.musicapi.service;

import dto.GuitarRequest;
import org.example.models.brands.Brand;
import org.example.models.products.Guitar;
import org.springframework.stereotype.Service;

@Service
public class GuitarService extends ProductService<Guitar, GuitarRequest>{

    @Override
    public Guitar create(GuitarRequest request) {
        Brand brand = new Brand(request.brandId, request.brandName);
        Guitar guitar = new Guitar(request.productId,
                                    request.modelName,
                                    request.condition,
                                    request.listPrice,
                                    request.discount,
                                    brand,
                                    request.color,
                                    request.guitarType,
                                    request.numberofStrings);
        return guitar;
    }




}
