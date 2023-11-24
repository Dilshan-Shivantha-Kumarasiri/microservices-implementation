package lkijse.gdse.itemservice.services.impl;

import lkijse.gdse.itemservice.dto.ItemDTO;
import lkijse.gdse.itemservice.repository.ItemRepository;
import lkijse.gdse.itemservice.services.ItemService;
import lkijse.gdse.itemservice.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository userRepository;
    @Autowired
    Converter converter;

    @Override
    public void saveUser(ItemDTO itemDTO) {

        userRepository.save(converter.convertToEntity(itemDTO));
    }
}
