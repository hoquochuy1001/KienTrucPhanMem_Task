package vn.edu.fit.hoquochuy_20053561_tuan6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.fit.hoquochuy_20053561_tuan6.models.Product;
import vn.edu.fit.hoquochuy_20053561_tuan6.repositories.ProductRepository;
import vn.edu.fit.hoquochuy_20053561_tuan6.services.impl.IProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public String getProductName(long ID) {
        Product product = productRepository.findById(ID).orElse(null);
        if (product != null) {
            return product.getProductName();
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public int getProductQuantity(Long productId) {
        Product product = productRepository.findById(productId).orElse(null);
        if (product == null || product.getQuantity() < 0) {
            return 0;
        }
        return product.getQuantity();
    }
}
