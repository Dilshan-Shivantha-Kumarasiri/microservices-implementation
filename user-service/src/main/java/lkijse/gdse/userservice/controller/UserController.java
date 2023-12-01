package lkijse.gdse.userservice.controller;

import lkijse.gdse.userservice.dto.UserDTO;
import lkijse.gdse.userservice.dto.UserItem;
import lkijse.gdse.userservice.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    RestTemplate restTemplate;


    @GetMapping
    public void saveUserDetails(UserDTO userDTO){
        System.out.println("user service");
    }

    @PostMapping
    public UserItem saveUserItem(@RequestBody UserItem userItem){
        return restTemplate.postForObject("http://localhost:8082/test/api/v1/item",userItem, UserItem.class);
    }


}
