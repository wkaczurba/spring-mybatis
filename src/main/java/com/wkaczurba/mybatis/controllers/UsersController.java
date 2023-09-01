package com.wkaczurba.mybatis.controllers;

import com.wkaczurba.mybatis.mapper.UsersMapper;
import com.wkaczurba.mybatis.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersController {

    private final UsersMapper usersMapper;

    public UsersController(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @GetMapping("/users")
    public List<Users> getAll() {
        return usersMapper.findAll();
    }

}
