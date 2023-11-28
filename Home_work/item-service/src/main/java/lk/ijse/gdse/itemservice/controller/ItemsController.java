package lk.ijse.gdse.itemservice.controller;

import lk.ijse.gdse.itemservice.dto.ItemsDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;

@RestController
@RequestMapping("/api/v1/items")
public class ItemsController {


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveItems(ItemsDTO itemsDto){

    }

}
