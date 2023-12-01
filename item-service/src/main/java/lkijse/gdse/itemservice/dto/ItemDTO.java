package lkijse.gdse.itemservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemDTO {

    private String itemName;
    private double itemPrice;
    private int itemQty;

}
