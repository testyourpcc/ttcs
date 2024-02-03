package com.n20dcat054.websellingphone.dao;

import com.n20dcat054.websellingphone.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{
    private EntityManager entityManager;
    @Autowired
    public ProductDAOImpl(EntityManager thEntityManager){
        entityManager=thEntityManager;
    }

    @Override
    public Product findById(Integer id) {
        return null;
    }

    @Override
    public List<Product> findAll() {

        TypedQuery<Product> theQuery = entityManager.createQuery("FROM Product",Product.class);
        List<Product> theProduct = theQuery.getResultList();
        return theProduct;

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
        String hql="FROM Product p";
        TypedQuery<Product> query=entityManager.createQuery(hql,Product.class);
        switch (id) {
            case 0://mới
                hql="FROM Product p ORDER BY p.productDate DESC";
                break;

            case 1://bán chạy
                hql="FROM Product p ORDER BY size(p.orderDetails) DESC";
                break;

            case 2://xem nhiều
                hql="FROM Product p ORDER BY p.viewCount DESC";
                break;

            case 3://giảm giá
                hql="FROM Product p ORDER BY p.discount DESC";
                break;

            case 4://dac biet
                hql="FROM Product p WHERE p.special=true ORDER BY p.productDate DESC";
                break;
        }
        query=entityManager.createQuery(hql,Product.class);
        query.setMaxResults(12);

        List<Product> list=query.getResultList();
        return list;
    }
}
