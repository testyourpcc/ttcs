package com.n20dcat054.websellingphone.controller;

import org.springframework.ui.Model;
import com.n20dcat054.websellingphone.dao.ProductDAO;
import com.n20dcat054.websellingphone.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class HomeController {
    @Autowired
    ProductDAO pdao;

    @GetMapping(value = {"", "/home"})
    public String index(Model model) {
        List<Product> list2 = pdao.findBySpecial(4);
        model.addAttribute("list", list2);
        List<Product> list3 = pdao.findBySpecial(0);
        model.addAttribute("list1", list3);
        return "home/index";
    }
}
