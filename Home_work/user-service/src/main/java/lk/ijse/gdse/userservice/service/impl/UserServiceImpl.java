package lk.ijse.gdse.userservice.service.impl;

import lk.ijse.gdse.userservice.dto.UserDTO;
import lk.ijse.gdse.userservice.reposiotry.UserRepository;
import lk.ijse.gdse.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(UserDTO userDto) {

    }
}