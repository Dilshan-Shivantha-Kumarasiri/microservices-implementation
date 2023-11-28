package lk.ijse.gdse.supplierservice.service;

import lk.ijse.gdse.supplierservice.dto.SupplierDTO;
import lk.ijse.gdse.supplierservice.entity.Supplier;
import org.springframework.stereotype.Service;

@Service
public interface SupplierService {
    void saveSupplier(SupplierDTO supplierDto);
}
