package com.mvc.example.controller;

import com.mvc.example.model.UserWeb;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author mmikilchenko on 24.02.2017.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new UserWeb());
        modelAndView.setViewName("home");
        return modelAndView;
    }


    @RequestMapping(value = "/welcome")
    public ModelAndView checkUser(@ModelAttribute("userJSP") UserWeb user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcomeUserPage");
        modelAndView.addObject("userJSP", user);
        return modelAndView;
    }
}
