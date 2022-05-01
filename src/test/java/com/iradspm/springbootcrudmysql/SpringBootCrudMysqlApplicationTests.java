package com.iradspm.springbootcrudmysql;

import com.iradspm.springbootcrudmysql.Model.User;
import com.iradspm.springbootcrudmysql.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootCrudMysqlApplicationTests {

    @Test
    void contextLoads() {

    }
    @Autowired
    private UserService userService;
    @Test
    public void save()
    {
        User u=new User();
        u.setFname("Irad");
        u.setLname("Mwendo");
        u.setEmail("Iraspm@gmail.com");
        userService.saveUser(u);
    }

}
