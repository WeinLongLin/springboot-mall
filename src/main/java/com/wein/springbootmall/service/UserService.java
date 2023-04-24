package com.wein.springbootmall.service;

import com.wein.springbootmall.dto.UserLoginRequest;
import com.wein.springbootmall.dto.UserRegisterRequest;
import com.wein.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);
}
