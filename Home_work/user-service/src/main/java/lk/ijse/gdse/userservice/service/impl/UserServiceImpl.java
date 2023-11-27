package lk.ijse.gdse.userservice.service.impl;

import lk.ijse.gdse.userservice.dto.UserDTO;
import lk.ijse.gdse.userservice.entity.User;
import lk.ijse.gdse.userservice.reposiotry.UserRepository;
import lk.ijse.gdse.userservice.service.UserService;
import lk.ijse.gdse.userservice.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    Converter converter;

    @Override
    public void saveUser(UserDTO userDto) {
        System.out.println(converter.convertToEntity(userDto).toString());
        userRepository.save(converter.convertToEntity(userDto));
    }

    @Override
    public UserDTO getExistsUserData(int userId) {
        Optional<User> getUser = userRepository.findById(userId);
        if (getUser.isEmpty()) throw new RuntimeException("user cannot found that id");
        Iterator<User> iterator = getUser.stream().iterator();
        System.out.println(iterator.next());
        return converter.convertToDto(iterator.next());
    }
}
