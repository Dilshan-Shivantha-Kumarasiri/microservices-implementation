package lk.ijse.gdse.apigateway.controller;


import lk.ijse.gdse.apigateway.dto.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("gateway/v1/controller")
public class ApiController {

    @Autowired
    RestTemplate restTemplate;

    @PostMapping
    @LoadBalanced
    @ResponseBody
    public ItemDTO addItem(@RequestBody ItemDTO itemDTO){
        return restTemplate.postForObject("http://localhost:8081/test/api/v1/user",itemDTO, ItemDTO.class);
    }
}
