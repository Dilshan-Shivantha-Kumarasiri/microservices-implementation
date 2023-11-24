package lkijse.gdse.itemservice.controller;

import lkijse.gdse.itemservice.dto.ItemDTO;
import lkijse.gdse.itemservice.services.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class ItemController {

    @Autowired
    ItemServiceImpl itemService;


    @PostMapping
    public void saveUserDetails(ItemDTO itemDTO){

    }

}
