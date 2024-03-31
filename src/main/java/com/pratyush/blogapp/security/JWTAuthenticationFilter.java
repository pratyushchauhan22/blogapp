package com.pratyush.blogapp.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationFilter;

public class JWTAuthenticationFilter extends AuthenticationFilter {

    private JWTAuthenticationManager jwtAuthenticationManager;

    public JWTAuthenticationFilter(JWTAuthenticationManager jwtAuthenticationManager) {
        super((AuthenticationManager) jwtAuthenticationManager, new JWTAuthenticationConverter());

        this.setSuccessHandler((request, response , authentication) -> {
            SecurityContextHolder.getContext().setAuthentication(authentication);
        });

    }
}
