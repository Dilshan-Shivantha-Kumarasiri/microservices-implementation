package lk.ijse.gdse.supplierservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("api/v1/supplier")
public class SupplierController {

    @Autowired
    RestTemplate restTemplate;


    @GetMapping
    public void supplier(String supplierId , String category){
        System.out.println(supplierId);
        System.out.println(category);
//        return restTemplate.getForObject("")
    }

}
