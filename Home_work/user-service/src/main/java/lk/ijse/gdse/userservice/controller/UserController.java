package lk.ijse.gdse.userservice.controller;

import lk.ijse.gdse.userservice.dto.UserDTO;
import lk.ijse.gdse.userservice.service.UserService;
import org.apache.tomcat.util.json.JSONFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RestTemplate restTemplate;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveUserDetails(@RequestBody UserDTO userDto){
        System.out.println(userDto.toString());
        userService.saveUser(userDto);
    }

    @ResponseBody
    @GetMapping(value = "{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO getExistsUserData(@PathVariable int userId){
        return userService.getExistsUserData(userId);
    }

//    @ResponseBody
//    @GetMapping(path = "/validate" ,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public String validatingUser(@RequestBody UserDTO userDTO){
//        return restTemplate.postForObject("http://localhost:8083/api/v1/orderDetails",userDTO,String);
//
//
//
////        return userService.validatingUser(userDTO);
//    }

}
