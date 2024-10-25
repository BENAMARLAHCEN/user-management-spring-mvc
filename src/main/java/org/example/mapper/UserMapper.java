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

    public static User toUser(UserDto userDto) {
        return new User(
                userDto.id(),
                userDto.firstName(),
                userDto.lastName(),
                userDto.identificationDocument(),
                userDto.nationality(),
                userDto.registrationDate(),
                userDto.expirationDate()
        );
    }
}
