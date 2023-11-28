package lk.ijse.gdse.itemservice.controller;

import lk.ijse.gdse.itemservice.dto.ItemsDTO;
import lk.ijse.gdse.itemservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/items")
public class ItemsController {

    @Autowired
    ItemService itemService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveItems(@RequestBody ItemsDTO itemsDto){
        itemService.saveItem(itemsDto);
    }

    @GetMapping(value = "{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ItemsDTO getItemDetails(@PathVariable int id){
        return itemService.getItemDetails(id);
    }

}
