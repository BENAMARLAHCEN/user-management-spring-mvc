package org.example.services;

import org.example.dto.UserDto;
import org.example.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserDto> findAll();

    Optional<UserDto> findById(Long id);

    User save(UserDto userDto);

    void deleteById(Long id);
}
