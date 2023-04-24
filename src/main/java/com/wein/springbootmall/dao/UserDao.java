package com.wein.springbootmall.dao;

import com.wein.springbootmall.dto.UserRegisterRequest;
import com.wein.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
