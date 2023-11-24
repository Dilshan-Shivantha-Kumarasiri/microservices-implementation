package lkijse.gdse.itemservice.repository;

import lkijse.gdse.itemservice.entity.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item,Integer> {
}
