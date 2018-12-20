package com.yupi.estutorial.controller;

import com.yupi.estutorial.dao.UserDao;
import com.yupi.estutorial.entity.User;
import com.yupi.estutorial.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private IUserService userService;

    @ApiOperation("增")
    @PostMapping
    User addUser(User user) {
        return userService.addUser(user);
    }

    @ApiOperation("删")
    @DeleteMapping
    void deleteUser(User user) {
        userService.deleteUser(user);
    }

    @ApiOperation("改")
    @PutMapping
    User updateUser(User user) {
        return userService.updateUser(user);
    }

    @ApiOperation("查")
    @GetMapping
    Optional<User> getUserById(String id) {
        return userService.getUserById(id);
    }

    @ApiOperation("查所有")
    @GetMapping("/all")
    Iterable<User> listAllUser() {
        return userService.listAllUser();
    }

}
