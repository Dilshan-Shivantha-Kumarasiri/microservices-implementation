package lk.ijse.gdse.itemservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ItemsDTO {

    private int itemId;
    private String itemName;
    private double itemPrice;
    private int itemQty;
    private String itemBrand;
    private String itemCategory;
    private String supplierCode;

}
