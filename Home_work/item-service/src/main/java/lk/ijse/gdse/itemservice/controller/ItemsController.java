package lk.ijse.gdse.itemservice.controller;

import lk.ijse.gdse.itemservice.dto.ItemsDTO;
import lk.ijse.gdse.itemservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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


    @ResponseBody
    @GetMapping(path = "/supplier/{supplierCode}/{itemCategory}",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ItemsDTO> getSupplierDetails(@PathVariable String supplierCode , @PathVariable String itemCategory){
        System.out.println("--------------");
//        System.out.println(itemsDTO.getSupplierCode());
//        System.out.println(itemsDTO.getItemCategory());
        return itemService.getSupplierDetails(supplierCode,itemCategory);
    }

}
