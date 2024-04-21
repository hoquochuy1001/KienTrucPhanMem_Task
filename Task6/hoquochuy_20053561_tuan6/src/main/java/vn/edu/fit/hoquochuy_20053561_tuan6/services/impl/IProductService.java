package vn.edu.fit.hoquochuy_20053561_tuan6.services.impl;

import vn.edu.fit.hoquochuy_20053561_tuan6.models.Product;

import java.util.List;

public interface IProductService {
    String getProductName(long ID);
    List<Product> getAllProducts();
    int getProductQuantity(Long productId);
}
