
package com.backEnd.SpringBoot.Security;

import com.backEnd.SpringBoot.Model.User;
import com.backEnd.SpringBoot.Security.Jwt.JwtTokenUtil;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthApi {
    @Autowired
    AuthenticationManager authManager;
    @Autowired
    JwtTokenUtil jwtTokenUtil;
    @PostMapping ("/api/login")
    public ResponseEntity<?> login (@RequestBody @Valid AuthRequest request){
    
    try{
    Authentication authentication = authManager.authenticate(
            new UsernamePasswordAuthenticationToken(
            request.getEmail(), request.getPassword())
            );
    
    User user = (User) authentication.getPrincipal();
    String accessToken = jwtTokenUtil.generateAccessToken(user);
    AuthResponse response = new AuthResponse(user.getEmail(), accessToken);
    
    return ResponseEntity.ok().body(response);
    
    } catch (BadCredentialsException ex) {
    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    
    }
     
    }
    
}
