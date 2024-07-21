package com.stock.stock.authentication;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private JwtService jwtService;
    public  String authenticate(Authentication authentication){
        return jwtService.getGenerateToken(authentication);
    }
}
