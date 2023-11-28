package lk.ijse.gdse.itemservice.util;

import lk.ijse.gdse.itemservice.dto.ItemsDTO;
import lk.ijse.gdse.itemservice.entity.Items;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Converter {

    @Autowired
    ModelMapper modelMapper;

    public Items convertToEntity(ItemsDTO itemsDTO){
        return modelMapper.map(itemsDTO, Items.class);
    }

    public ItemsDTO convertToDto(Items items){
        return modelMapper.map(items, ItemsDTO.class);
    }

}
