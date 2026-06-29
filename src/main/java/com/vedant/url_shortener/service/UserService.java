package com.vedant.url_shortener.service;

import com.vedant.url_shortener.dto.RegisterRequest;
import com.vedant.url_shortener.dto.UserResponse;

public interface UserService {

    UserResponse registerUser(RegisterRequest request);

}