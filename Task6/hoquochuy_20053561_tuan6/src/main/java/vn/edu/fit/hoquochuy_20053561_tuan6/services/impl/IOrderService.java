package vn.edu.fit.hoquochuy_20053561_tuan6.services.impl;

import vn.edu.fit.hoquochuy_20053561_tuan6.models.Orders;

public interface IOrderService {
    Orders purchaseProduct(Long productId, String name, Integer quantity, double price);
}
