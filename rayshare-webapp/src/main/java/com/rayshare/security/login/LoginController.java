package com.rayshare.security.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

/**
 * Created with IntelliJ IDEA.
 * User: Milo
 * Date: 1/7/14
 * Time: 2:09 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class LoginController {
    @RequestMapping(value="/welcome", method = RequestMethod.GET)
    public String printWelcome(ModelMap model, Principal principal ) {

        String name = principal.getName();
        model.addAttribute("username", name);
        model.addAttribute("message", "Spring Security Custom Form example");
        return "hello";

    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(ModelMap model) {

        return "login";

    }

    @RequestMapping(value="/signin", method = RequestMethod.GET)
    public String signin(ModelMap model) {

        return "signin";

    }

    @RequestMapping(value="/loginfailed", method = RequestMethod.GET)
    public String loginerror(ModelMap model) {

        model.addAttribute("error", "true");
        return "signin";

    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {

        return "signin";

    }

}
