package com.example.springboot_cors_source.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  @GetMapping("/Hello")
  public String hello() {
    return "Test";
  }

}
