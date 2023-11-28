package lk.ijse.gdse.itemservice.service.impl;

import lk.ijse.gdse.itemservice.dto.ItemsDTO;
import lk.ijse.gdse.itemservice.entity.Items;
import lk.ijse.gdse.itemservice.repository.ItemRepository;
import lk.ijse.gdse.itemservice.service.ItemService;
import lk.ijse.gdse.itemservice.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public ItemsDTO getItemDetails(int id) {
        Optional<Items> item = itemRepository.findById(id);
        if (item.isEmpty()) throw new RuntimeException("items cannot found");
        return converter.convertToDto(item.get());
    }
}
