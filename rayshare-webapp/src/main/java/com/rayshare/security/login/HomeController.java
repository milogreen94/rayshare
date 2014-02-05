package com.rayshare.security.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: Milo
 * Date: 1/6/14
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring MVC Sample Home Page");
        return "home";

    }

}
