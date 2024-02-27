package com.hji0210.simpleboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class HomeController {

    @GetMapping("home")
    public ModelAndView home(@RequestParam(name = "value") String value) {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("value", value);
        return modelAndView;
    }
}
