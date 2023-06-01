package com.example.DecorEcomerceProject.Entities.DTO;

import lombok.Data;

@Data
public class ChangePassword {
    private String phone;
    private String oldPassword;
    private String newPassword;
}
