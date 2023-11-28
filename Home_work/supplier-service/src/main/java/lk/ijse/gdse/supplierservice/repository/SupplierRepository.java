package lk.ijse.gdse.supplierservice.repository;

import lk.ijse.gdse.supplierservice.entity.Supplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier,Integer> {


}
