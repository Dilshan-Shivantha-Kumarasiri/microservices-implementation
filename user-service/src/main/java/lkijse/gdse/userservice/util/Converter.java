package lkijse.gdse.userservice.util;

import lkijse.gdse.userservice.dto.UserDTO;
import lkijse.gdse.userservice.entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Converter {
    @Autowired
    ModelMapper modelMapper;

    public User convertToEntity(UserDTO userDTO){
        return modelMapper.map(userDTO,User.class);
    }
}
