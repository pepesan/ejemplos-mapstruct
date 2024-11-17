package com.cursosdedesarrollo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testApp()
    {
        assertTrue( true );
    }

    @Test
    public void testMapStructUserToUserDTO()
    {
        // Crear un objeto User
        User user = new User();
        user.setId(1L);
        user.setName("Juan Pérez");
        user.setEmail("juan.perez@example.com");

        // Mapear User a UserDTO
        UserDTO userDTO = UserMapper.INSTANCE.userToUserDTO(user);

        // Mostrar los datos del DTO
        System.out.println("Name: " + userDTO.getName());
        System.out.println("Email: " + userDTO.getEmail());
        assertEquals(user.getName(), userDTO.getName());
        assertEquals(user.getEmail(), userDTO.getEmail());
    }

    @Test
    public void testMapStructUserDTOToUser()
    {
        // Crear un objeto User
        UserDTO userDto = new UserDTO();
        userDto.setName("Juan Pérez");
        userDto.setEmail("juan.perez@example.com");

        // Mapear User a UserDTO
        User user = UserMapper.INSTANCE.userDTOToUser(userDto);

        // Mostrar los datos del DTO
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        assertEquals(userDto.getName(), user.getName());
        assertEquals(userDto.getEmail(), user.getEmail());
    }
}
