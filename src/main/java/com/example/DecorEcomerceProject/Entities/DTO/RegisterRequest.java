package com.example.DecorEcomerceProject.Entities.DTO;

import lombok.Data;

@Data
public class RegisterRequest {
    private String name;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
}
