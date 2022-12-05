package com.example.student_new_app_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String homePage(){
        return "Welcome to my website";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return "Welcome to contact page";
    }

    @GetMapping("/gallery")
    public String galleryPage(){
        return "Welcome to gallery";
    }

    @GetMapping("/home")
    public String homeClonePage(){
        return "Welcome to Home";
    }


}
