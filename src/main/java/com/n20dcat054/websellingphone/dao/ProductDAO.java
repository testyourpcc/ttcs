package com.n20dcat054.websellingphone.dao;


import com.n20dcat054.websellingphone.entity.Product;

import java.util.List;

public interface ProductDAO {
    Product findById(Integer id);

    List<Product> findAll();

    Product create(Product entity);

    void update(Product entity);

    Product delete(Integer id);

    List<Product> findByCategoryId(Integer categoryId);

    List<Product> findByKeywords(String keywords);

    List<Product> findByIds(String ids);

    List<Product> findBySpecial(Integer id);
}
