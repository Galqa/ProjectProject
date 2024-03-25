package com.project.newweb.controllers;


import com.project.newweb.model.Magazine;
import com.project.newweb.repository.MagazineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class MagazineController {

    @Autowired
    private MagazineRepository magazineRepository;

    @GetMapping("/shop")
    public String showShopPage(Model model) {
        List<Magazine> magazines = magazineRepository.findAll();
        model.addAttribute("magazines", magazines);
        return "shop";
    }
}


