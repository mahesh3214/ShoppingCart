package com.Company.example.CompanyController;

import com.Company.example.CompanyRepository.CompanyRepository;
import com.Company.example.Model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {


    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/list")
    public List<Company> getCompanyDetails() {
        return companyRepository.findAll();
    }
}
