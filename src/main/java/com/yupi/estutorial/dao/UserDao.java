package com.yupi.estutorial.dao;

import com.yupi.estutorial.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String> {
}
