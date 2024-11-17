package com.cursosdedesarrollo;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    // Mapeo de UserDTO a User
    User userDTOToUser(UserDTO userDTO);
}

