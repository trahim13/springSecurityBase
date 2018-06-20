package org.trahim.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.trahim.spring.service.ProcessInterface;

import java.security.Principal;

@Controller
public class LoginController {


    @Autowired
    private ProcessInterface process;

    @RequestMapping (value = "/admin", method = RequestMethod.GET)
    public ModelAndView adminPage(ModelAndView modelAndView) {

        modelAndView.addObject("secured", process.getMessage());
        modelAndView.setViewName("content/admin");
        return modelAndView;
    }

    @RequestMapping (value = "/user", method = RequestMethod.GET)
    public ModelAndView userPage(ModelAndView modelAndView) {

        modelAndView.addObject("secured", process.getMessage());

        modelAndView.setViewName("content/user");
        return modelAndView;
    }




    @RequestMapping(value = {"/", "login"}, method = RequestMethod.GET)
    public ModelAndView login( @RequestParam(required = false, value = "error") String error, ModelAndView modelAndView) {
        if (error != null) {
            modelAndView.addObject("error", "Invalid username or password!");
        }
        modelAndView.setViewName("login");

        return modelAndView;
    }

    @RequestMapping(value = "accessDenied", method = RequestMethod.GET)
    public ModelAndView accessDenied(Principal user) {

        ModelAndView modelAndView = new ModelAndView("content/accessDenied");

        if (user != null) {
            modelAndView.addObject("errorMsg", user.getName() + " у Вас нет доступа " +
                    "к этой странице");
        } else {
            modelAndView.addObject("errorMsg", "У Вас нет доступа к указанной странице.");
        }

        return modelAndView;

    }
}
