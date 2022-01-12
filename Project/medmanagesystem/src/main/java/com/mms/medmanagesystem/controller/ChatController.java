package com.mms.medmanagesystem.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ChatController {

  @GetMapping("/chat")
  public ModelAndView chat(Model model) {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("chat");
    return modelAndView;
  }

}