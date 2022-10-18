package com.andreev.service.service;

import com.andreev.database.dao.UserDao;
import com.andreev.service.dto.UserDto;

import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();
    public Optional<UserDto> getUser(Long id){
        return userDao.findById(id).map(elem -> new UserDto());
    }
}
