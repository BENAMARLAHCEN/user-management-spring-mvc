package org.example.services;

import org.example.dto.UserDto;
import org.example.entities.User;
import org.example.mapper.UserMapper;
import org.example.repositories.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream()
                .map(UserMapper::toUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UserDto> findById(Long id) {
        return userRepository.findById(id).map(UserMapper::toUserDto);
    }

    @Override
    public User save(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.firstName());
        user.setLastName(userDto.lastName());
        user.setIdentificationDocument(userDto.identificationDocument());
        user.setNationality(userDto.nationality());
        user.setRegistrationDate(userDto.registrationDate());
        user.setExpirationDate(userDto.expirationDate());
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
