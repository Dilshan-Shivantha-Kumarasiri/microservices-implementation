package lk.ijse.gdse.supplierservice.util;

import lk.ijse.gdse.supplierservice.dto.SupplierDTO;
import lk.ijse.gdse.supplierservice.entity.Supplier;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Converter {

    @Autowired
    ModelMapper modelMapper;

    public Supplier convertToEntity(SupplierDTO supplierDTO){
        return modelMapper.map(supplierDTO,Supplier.class);
    }
    public SupplierDTO convertToDto(Supplier supplier){
        return modelMapper.map(supplier,SupplierDTO.class);
    }

}
