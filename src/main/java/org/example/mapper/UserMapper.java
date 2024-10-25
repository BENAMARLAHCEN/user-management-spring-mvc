package org.example.mapper;

import org.example.dto.UserDto;
import org.example.entities.User;

public class UserMapper {

    public static UserDto toUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getIdentificationDocument(),
                user.getNationality(),
                user.getRegistrationDate(),
                user.getExpirationDate()
        );
    }
}
