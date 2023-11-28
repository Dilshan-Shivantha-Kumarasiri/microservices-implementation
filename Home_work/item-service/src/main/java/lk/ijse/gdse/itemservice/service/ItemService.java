package lk.ijse.gdse.itemservice.service;

import lk.ijse.gdse.itemservice.dto.ItemsDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface ItemService {
    void saveItem(ItemsDTO itemsDto);

    ItemsDTO getItemDetails(int id);

    List<ItemsDTO> getSupplierDetails(String supplierCode, String category);
}
