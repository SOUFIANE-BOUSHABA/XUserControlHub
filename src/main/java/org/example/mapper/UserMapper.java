
package org.example.mapper;

import org.example.dto.UserDTO;
import org.example.entity.User;

public class UserMapper {


    public static UserDTO toDTO(User user) {
        if (user == null) {
            return null;
        }

        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setIdentificationNumber(user.getIdentificationNumber());
        userDTO.setNationality(user.getNationality());
        userDTO.setRegistrationDate(user.getRegistrationDate());
        userDTO.setExpirationDate(user.getExpirationDate());

        return userDTO;
    }


    public static User toEntity(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }

        User user = new User();
        user.setId(userDTO.getId());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setIdentificationNumber(userDTO.getIdentificationNumber());
        user.setNationality(userDTO.getNationality());
        user.setRegistrationDate(userDTO.getRegistrationDate());
        user.setExpirationDate(userDTO.getExpirationDate());

        return user;
    }
}
