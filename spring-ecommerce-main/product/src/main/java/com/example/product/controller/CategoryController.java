package com.example.product.controller;

import com.example.product.entity.Category;
import com.example.product.entity.Product;
import com.example.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/category")
    public String Categoryform(Model model) {
        Category category = new Category();
//        model.addAttribute("Category", category);
//        return "categoryform";
        return null;
    }

    @GetMapping("/findCategory/{id}")
    public void findCategory(@PathVariable("id") int id) {
        categoryService.findCategory(id);

    }

    @GetMapping("/deleteCategory/{id}")
    public void deleteCategory(@PathVariable("id") int id) {
        categoryService.deleteCategory(id);
    }

    @PostMapping("/saveCata")
    public void saveCata(@ModelAttribute Category category) {
        categoryService.saveCategory(category);

    }

}
