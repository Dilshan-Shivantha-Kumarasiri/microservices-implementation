package lk.ijse.gdse.userservice.reposiotry;

import lk.ijse.gdse.userservice.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
