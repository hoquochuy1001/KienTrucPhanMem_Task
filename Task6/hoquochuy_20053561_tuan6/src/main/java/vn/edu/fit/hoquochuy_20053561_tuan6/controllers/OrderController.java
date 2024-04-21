package vn.edu.fit.hoquochuy_20053561_tuan6.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.fit.hoquochuy_20053561_tuan6.services.OrderServiceImpl;

@Controller
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/orders")
    public String purchaseOrder(@RequestParam String encryptedData) throws Exception {

        // Send encryptedData to queue "order_products"
        jmsTemplate.convertAndSend("order_products", encryptedData);
        ResponseEntity.ok().body("Order received. Processing...");

        return "redirect:/products";
    }
}
