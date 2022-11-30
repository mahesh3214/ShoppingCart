package com.Company.example.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="companydata")
public class Company {
    @Id
    private String id;
    private String name;
    private String username;
    @JsonIgnore
    private String password;
}
