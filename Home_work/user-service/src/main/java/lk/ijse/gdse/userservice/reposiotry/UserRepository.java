package lk.ijse.gdse.userservice.reposiotry;

import lk.ijse.gdse.userservice.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
