package lkijse.gdse.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserItem {

    private String itemName;
    private double itemPrice;
    private int itemQty;
}
