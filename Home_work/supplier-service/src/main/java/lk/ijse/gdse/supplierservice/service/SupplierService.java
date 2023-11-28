package lk.ijse.gdse.supplierservice.service;

import lk.ijse.gdse.supplierservice.entity.Supplier;
import org.springframework.stereotype.Service;

@Service
public interface SupplierService {
    void saveSupplier(Supplier supplier);
}
