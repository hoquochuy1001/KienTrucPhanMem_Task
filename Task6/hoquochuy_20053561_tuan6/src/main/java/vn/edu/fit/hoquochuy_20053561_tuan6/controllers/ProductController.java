package vn.edu.fit.hoquochuy_20053561_tuan6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.fit.hoquochuy_20053561_tuan6.models.Product;
import vn.edu.fit.hoquochuy_20053561_tuan6.services.impl.IProductService;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products")
    public String products(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "products";
    }
}
