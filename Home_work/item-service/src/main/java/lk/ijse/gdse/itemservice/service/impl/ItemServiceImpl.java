package lk.ijse.gdse.itemservice.service.impl;

import lk.ijse.gdse.itemservice.dto.ItemsDTO;
import lk.ijse.gdse.itemservice.repository.ItemRepository;
import lk.ijse.gdse.itemservice.service.ItemService;
import lk.ijse.gdse.itemservice.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;
    @Autowired
    Converter converter;


    @Override
    public void saveItem(ItemsDTO itemsDto) {
        itemRepository.save(converter.convertToEntity(itemsDto));
    }
}
