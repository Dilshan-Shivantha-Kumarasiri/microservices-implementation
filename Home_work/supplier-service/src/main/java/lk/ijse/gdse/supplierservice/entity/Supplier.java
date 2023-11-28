package lk.ijse.gdse.supplierservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Supplier {
    private int supplierId;
    private String supplierName;
    private String supplierCode;
}
