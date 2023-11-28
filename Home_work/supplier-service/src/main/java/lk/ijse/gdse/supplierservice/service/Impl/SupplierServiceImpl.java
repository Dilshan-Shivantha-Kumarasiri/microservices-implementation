package lk.ijse.gdse.supplierservice.service.Impl;

import lk.ijse.gdse.supplierservice.dto.SupplierDTO;
import lk.ijse.gdse.supplierservice.entity.Supplier;
import lk.ijse.gdse.supplierservice.repository.SupplierRepository;
import lk.ijse.gdse.supplierservice.service.SupplierService;
import lk.ijse.gdse.supplierservice.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SupplierRepository supplierRepository;
    @Autowired
    Converter converter;

    @Override
    public void saveSupplier(SupplierDTO supplierDto) {
        supplierRepository.save(converter.convertToEntity(supplierDto));
    }
}
