package me.dio.service;

import me.dio.domain.model.User;

import java.util.Optional;

public interface UserService {
    User findById(long id);
    User create (User userToCreate);
}
