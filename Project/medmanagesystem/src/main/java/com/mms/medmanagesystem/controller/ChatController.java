package com.mms.medmanagesystem.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

  @GetMapping("/chat")
  public String chat(Model model) {
    return "chat";
  }

}