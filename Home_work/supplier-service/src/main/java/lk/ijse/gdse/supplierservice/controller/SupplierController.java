package lk.ijse.gdse.supplierservice.controller;

import lk.ijse.gdse.supplierservice.dto.SupplierItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("api/v1/supplier")
public class SupplierController {

    @Autowired
    RestTemplate restTemplate;


    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void supplier(@RequestBody SupplierItem supplierItem){
        System.out.println(supplierItem.getSupplierCode());
        System.out.println(supplierItem.getItemCategory());
//        return restTemplate.getForObject("")
    }

}
