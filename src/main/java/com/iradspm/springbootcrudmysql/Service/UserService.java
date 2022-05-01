package com.iradspm.springbootcrudmysql.Service;

import com.iradspm.springbootcrudmysql.Model.User;
import com.iradspm.springbootcrudmysql.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //method to save to database
    public void saveUser(User u)
    {
        userRepository.save(u);
    }
    //method to retrieve list of registered uses
    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
}
