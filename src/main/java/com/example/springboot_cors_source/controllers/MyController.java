package com.example.springboot_cors_source.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  //=======================================================================
  // SOURCE
  //=======================================================================
  @GetMapping("/Source")
  public String source() {
    return "Source";
  }

}
