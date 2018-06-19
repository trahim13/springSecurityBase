package org.trahim.spring.contrillers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping (value = "/admin", method = RequestMethod.GET)
    public String adminPage() {
        return "content/admin";
    }

    @RequestMapping (value = "/user", method = RequestMethod.GET)
    public String userPage() {
        return "content/user";
    }




    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView login( @RequestParam(required = false, value = "error") String error, ModelAndView modelAndView) {
        if (error != null) {
            modelAndView.addObject("error", "Invalid username or password!");
        }
        modelAndView.setViewName("login");

        return modelAndView;
    }
}
