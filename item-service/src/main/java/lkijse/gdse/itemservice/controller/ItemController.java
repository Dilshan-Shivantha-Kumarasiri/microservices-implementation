package lkijse.gdse.itemservice.controller;

import lkijse.gdse.itemservice.dto.ItemDTO;
import lkijse.gdse.itemservice.services.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/user")
public class ItemController {

    @Autowired
    ItemServiceImpl itemService;

    @Autowired
    RestTemplate restTemplate;


    @PostMapping
    public String saveUserDetails(){
        return restTemplate.getForObject("http://localhost//8081/api/v1/user",String.class);
    }

}
