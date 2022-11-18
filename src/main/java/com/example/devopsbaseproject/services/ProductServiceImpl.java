package com.example.devopsbaseproject.services;

import com.example.devopsbaseproject.domain.Product;
import com.example.devopsbaseproject.repositories.ProductRepository;
import com.example.devopsbaseproject.services.jms.JmsTextMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    private JmsTextMessageService jmsTextMessageService;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Autowired
    public void setJmsTextMessageService(JmsTextMessageService jmsTextMessageService) {
        this.jmsTextMessageService = jmsTextMessageService;
    }

    @Override
    public Product getProduct(Integer id) {
        jmsTextMessageService.sendTextMessage("Fetching Product ID: " + id );
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> listProducts() {
        jmsTextMessageService.sendTextMessage("Listing Products");
        return productRepository.findAll();
    }
}
