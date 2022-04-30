package com.iradspm.springbootcrudmysql.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping("/")
    public String getHomePage()
    {
        return "index";
    }
    @RequestMapping("/users")
    public String getUsersPage(Model model)
    {

        return "UserPage";
    }
    @RequestMapping("/contact")
    public String getContactPage()
    {
        return "ContactPage";
    }
}
