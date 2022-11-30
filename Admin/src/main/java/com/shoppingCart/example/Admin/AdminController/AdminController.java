package com.shoppingCart.example.Admin.AdminController;

import com.shoppingCart.example.Admin.AdminRepository.AdminRepository;
import com.shoppingCart.example.Admin.Model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository;


    @GetMapping("/list")
    public List<Admin> getAdminDetails() {
        return adminRepository.findAll();
    }
}
