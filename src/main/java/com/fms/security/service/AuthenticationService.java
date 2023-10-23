package com.fms.security.service;

import com.fms.security.dao.JwtAuthenticationResponse;
import com.fms.security.dao.SignUpRequest;
import com.fms.security.dao.SigninRequest;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}