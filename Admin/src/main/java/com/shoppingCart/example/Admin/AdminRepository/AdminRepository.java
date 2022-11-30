package com.shoppingCart.example.Admin.AdminRepository;

import com.shoppingCart.example.Admin.Model.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin,String> {
}
