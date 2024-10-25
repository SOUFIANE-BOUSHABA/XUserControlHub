
package org.example.mapper;

import org.example.dto.UserDTO;
import org.example.entity.User;

public class UserMapper {


    public static UserDTO toDTO(User user) {
        if (user == null) {
            return null;
        }

        UserDTO userDTO = new UserDTO(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getIdentificationNumber(),
                user.getNationality(),
                user.getRegistrationDate(),
                user.getExpirationDate()
        );

        return userDTO;
    }


    public static User toEntity(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }

        User user = new User(
                userDTO.id(),
                userDTO.firstName(),
                userDTO.lastName(),
                userDTO.identificationNumber(),
                userDTO.nationality(),
                userDTO.registrationDate(),
                userDTO.expirationDate()
        );

        return user;
    }
}
