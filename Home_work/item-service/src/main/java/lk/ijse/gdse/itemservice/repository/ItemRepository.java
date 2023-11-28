package lk.ijse.gdse.itemservice.repository;

import lk.ijse.gdse.itemservice.entity.Items;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Items,Integer> {

    @Query("select item from Items item where item.supplierCode= :supplierCode and item.itemCategory = :category")
    List<Items> getItems(@Param("supplierCode") String supplierCode, @Param("category") String category);
}
