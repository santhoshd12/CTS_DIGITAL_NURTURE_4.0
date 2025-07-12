package com.example;

import org.springframework.web.bind.annotation.*;
import java.nio.charset.StandardCharsets;


import java.util.Base64;

@RestController
public class AuthenticationController {

	@RequestMapping("/authenticate")
	public TokenResponse authenticate(@RequestHeader("Authorization") String authHeader) {
	    System.out.println("Authorization Header: " + authHeader);

	    String base64Credentials = authHeader.substring("Basic".length()).trim();
	    byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
	    String credentials = new String(decodedBytes, StandardCharsets.UTF_8);

	    System.out.println("Decoded Credentials: " + credentials);

	    String[] parts = credentials.split(":", 2);
	    String username = parts[0];
	    String password = parts[1];

	    if (!"user".equals(username) || !"pwd".equals(password)) {
	        throw new RuntimeException("Invalid credentials");
	    }

	    String token = JwtUtil.generateToken(username);
	    return new TokenResponse(token);
	}

}
