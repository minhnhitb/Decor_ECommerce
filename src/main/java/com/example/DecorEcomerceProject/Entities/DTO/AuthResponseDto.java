package com.example.DecorEcomerceProject.Entities.DTO;

import com.example.DecorEcomerceProject.Security.SecurityConstants;
import lombok.Data;

@Data
public class AuthResponseDto {
    private String accessToken;
    private String tokenType = "Bearer";
    private long  tokenExpiration = SecurityConstants.JWT_EXPIRATION;
    public AuthResponseDto(String accessToken){
        this.accessToken = accessToken;
    }
}
