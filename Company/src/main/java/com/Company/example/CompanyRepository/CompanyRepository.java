package com.Company.example.CompanyRepository;

import com.Company.example.Model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company,String> {
}
