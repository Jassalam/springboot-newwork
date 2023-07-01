package com.example.authors.service;

import com.example.authors.model.Author;
import com.example.authors.repository.AuthorRepository;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    private static final Logger log = LoggerFactory.getLogger(AuthorService.class);

   // @Autowired
    //JdbcTemplate jdbcTemplate;

    @Autowired
    AuthorRepository authorRepository;

    @PostConstruct
    public void postConstruct(){
       Author author = new Author();
       author.setId(1L);
       author.setFirstName("Mark");
       author.setLastName("Sohung");

       log.info("Saving data into database");
       authorRepository.save(author);

       log.info("Retrive all records");
       log.info("Authors: " + authorRepository.findAll());
    }
}
