package com.n20dcat054.websellingphone.service;

import com.n20dcat054.websellingphone.dao.ProductDAO;
import com.n20dcat054.websellingphone.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    private ProductDAO productDAO;
    @Autowired
    public ProductServiceImpl(ProductDAO theProductDAO){
        productDAO=theProductDAO;
    }
    @Override
    public Product findById(Integer id) {
        return productDAO.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product create(Product entity) {
        return null;
    }

    @Override
    public void update(Product entity) {

    }

    @Override
    public Product delete(Integer id) {
        return null;
    }

    @Override
    public List<Product> findByCategoryId(Integer categoryId) {
        return null;
    }

    @Override
    public List<Product> findByKeywords(String keywords) {
        return null;
    }

    @Override
    public List<Product> findByIds(String ids) {
        return null;
    }

    @Override
    public List<Product> findBySpecial(Integer id) {
        return null;
    }
}
