package lkijse.gdse.itemservice.controller;

import lkijse.gdse.itemservice.dto.ItemDTO;
import lkijse.gdse.itemservice.services.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    ItemServiceImpl itemService;

    @Autowired
    RestTemplate restTemplate;


//    @ResponseBody
    @PostMapping
    public ItemDTO saveItemDetails(@RequestBody ItemDTO itemDTO){
        System.out.println(itemDTO.toString());
        itemDTO.setItemName("iphone 14 pro");
        return itemDTO;
    }

}
