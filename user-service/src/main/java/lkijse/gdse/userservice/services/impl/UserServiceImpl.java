package lkijse.gdse.userservice.services.impl;

import lkijse.gdse.userservice.dto.UserDTO;
import lkijse.gdse.userservice.repository.UserRepository;
import lkijse.gdse.userservice.services.UserService;
import lkijse.gdse.userservice.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    Converter converter;

    @Override
    public void saveUser(UserDTO userDTO) {

        userRepository.save(converter.convertToEntity(userDTO));
    }
}
