package com.iradspm.springbootcrudmysql.Controller;

import com.iradspm.springbootcrudmysql.Model.User;
import com.iradspm.springbootcrudmysql.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WebController {

    @Autowired
    private UserService u;

    @RequestMapping("/")
    public String getHomePage()
    {
        return "index";
    }

    @RequestMapping("/users")
    public String getUsersPage(Model model)
    {
        List<User>usersList=u.getAllUsers();
        model.addAttribute("userlist",usersList);
        return "UserPage";
    }
    @RequestMapping("/contact")
    public String getContactPage()
    {
        return "ContactPage";
    }
    @RequestMapping("/addUser")
    public String newUserPage()
    {
        return "new_user";
    }
    //save user
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user)
    {
        u.saveUser(user);
        return "redirect:/users";
    }
}
