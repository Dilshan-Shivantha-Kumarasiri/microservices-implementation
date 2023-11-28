package lk.ijse.gdse.supplierservice.util;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestConverter{

    public  List<HttpMessageConverter<?>> getJsonMessageConverter(){
        List<HttpMessageConverter<?>> converters = new ArrayList<>();
        converters.add(new MappingJackson2CborHttpMessageConverter());
        return converters;
    }

}
