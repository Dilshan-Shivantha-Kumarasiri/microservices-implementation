package lkijse.gdse.userservice.controller;

import lkijse.gdse.userservice.dto.UserDTO;
import lkijse.gdse.userservice.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;


    @PostMapping
    public void saveUserDetails(UserDTO userDTO){

    }

}
