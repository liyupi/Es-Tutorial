package com.yupi.estutorial.service;

import com.yupi.estutorial.entity.User;

import java.util.Optional;

public interface IUserService {

    User addUser(User user);

    void deleteUser(User user);

    User updateUser(User user);

    Optional<User> getUserById(String id);

    Iterable<User> listAllUser();
}
