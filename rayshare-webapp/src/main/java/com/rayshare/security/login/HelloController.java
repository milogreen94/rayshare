package com.rayshare.security.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: Milo
 * Date: 1/7/14
 * Time: 1:20 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/welcome2")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring Security Hello World");
        return "hello";

    }
}
