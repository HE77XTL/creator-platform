package com.heds.creatorplatform.utils;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

public class JwtUtil {

    private static final Key JWT_SECRET = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private static final int JWT_EXPIRATION_MS = 3600000; // 1 hour

    public static String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("sub", username);
        claims.put("created", new Date());

        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + JWT_EXPIRATION_MS))
                .signWith(JWT_SECRET)
                .compact();
    }



}
