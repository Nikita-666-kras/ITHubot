package com.example.ITHubot.Dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String Name;
    private String Email;
    private String password;
}
