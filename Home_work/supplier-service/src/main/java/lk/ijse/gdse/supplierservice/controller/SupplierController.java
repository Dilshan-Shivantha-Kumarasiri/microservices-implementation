package lk.ijse.gdse.supplierservice.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.netflix.discovery.converters.wrappers.CodecWrappers;
import lk.ijse.gdse.supplierservice.dto.SupplierDTO;
import lk.ijse.gdse.supplierservice.dto.SupplierItem;
import lk.ijse.gdse.supplierservice.entity.Supplier;
import lk.ijse.gdse.supplierservice.service.SupplierService;
import lk.ijse.gdse.supplierservice.util.RestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;

@RestController
@RequestMapping("api/v1/supplier")
public class SupplierController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    RestConverter restConverter;
    @Autowired
    SupplierService supplierService;



    @ResponseBody
    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList supplier(@RequestBody SupplierItem supplierItem){
        System.out.println(supplierItem.getSupplierCode());
        System.out.println(supplierItem.getItemCategory());

        return restTemplate.getForObject("http://localhost:8082/api/v1/items/supplier/"+
                supplierItem.getSupplierCode()+
                "/"+supplierItem.getItemCategory(), ArrayList.class);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveSupplier(@RequestBody SupplierDTO supplierDTO){
        supplierService.saveSupplier(supplierDTO);
    }

}
