package com.example.DecorEcomerceProject.Controller;

import com.example.DecorEcomerceProject.Entities.DTO.LoginRequest;
import com.example.DecorEcomerceProject.Entities.User;

import com.example.DecorEcomerceProject.Service.IUserService;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private IUserService userService;
    private AuthenticationManager authenticationManager;

    public AuthController(IUserService userService,AuthenticationManager authenticationManager) {
        this.userService = userService;
        this.authenticationManager = authenticationManager;
    }
    //    @PostMapping("/register ")
//    public ResponseEntity<?> register(@RequestBody User model){
////       User existedPhone =  userService.findUserByPhone(model.getPhone());
////       User existedEmail = userService.getByEmail(model.getEmail());
////       if(existedPhone != null && existedEmail != null){
////           return  ResponseEntity.badRequest().body("Cannot create this account.");
////       }else {
////           User createdUser = userService.register(model);
////           return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
////            //return ResponseEntity.ok().body("Created Successful");
////       }
//        User createdUser = userService.register(model);
//        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
//    }

//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody LoginRequest model){
//        Authentication authentication = authenticationManager
//                .authenticate(new UsernamePasswordAuthenticationToken(model.getPhone(),model.getPassword()));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        return new ResponseEntity<>("User signed success", HttpStatus.OK);
//    }
}
