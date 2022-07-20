package com.EcommWeb.CatalogService.services;

import com.EcommWeb.CatalogService.entities.Product;
import com.EcommWeb.CatalogService.models.PdpResponse;


public class PdpConverter {
    public PdpResponse convertProductToPdp (Product product){

        PdpResponse convert = new PdpResponse.PdpResponseBuilder()
                .title(product.getTitle())
                .description(product.getDescription())
                .price(product.getPrice())
                .imageUrl(product.getImageUrl())
                .category(product.getCategory())
                .build();
        return convert;
    }
}
