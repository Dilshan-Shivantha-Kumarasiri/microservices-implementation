package lkijse.gdse.itemservice.util;

import lkijse.gdse.itemservice.dto.ItemDTO;
import lkijse.gdse.itemservice.entity.Item;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Converter {
    @Autowired
    ModelMapper modelMapper;

    public Item convertToEntity(ItemDTO itemDTO){
        return modelMapper.map(itemDTO, Item.class);
    }
}
