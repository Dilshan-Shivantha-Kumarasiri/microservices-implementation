package lk.ijse.gdse.itemservice.repository;

import lk.ijse.gdse.itemservice.entity.Items;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Items,Integer> {

}
