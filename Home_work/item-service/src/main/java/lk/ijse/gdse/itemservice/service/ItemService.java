package lk.ijse.gdse.itemservice.service;

import lk.ijse.gdse.itemservice.dto.ItemsDTO;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {
    void saveItem(ItemsDTO itemsDto);

    ItemsDTO getItemDetails(int id);
}
