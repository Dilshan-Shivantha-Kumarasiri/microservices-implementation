package lk.ijse.gdse.userservice.controller;

import lk.ijse.gdse.userservice.dto.UserDTO;
import lk.ijse.gdse.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveUserDetails(@RequestBody UserDTO userDto){
        System.out.println(userDto.toString());
        userService.saveUser(userDto);
    }

    @GetMapping("{userId}")
    public void getExistsUserData(@PathVariable int userId){
        userService.getExistsUserData(userId);
    }


}
