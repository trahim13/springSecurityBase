package org.trahim.spring.contrillers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main(ModelAndView modelAndView) {
        modelAndView.addObject("message", "Spring security");
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
