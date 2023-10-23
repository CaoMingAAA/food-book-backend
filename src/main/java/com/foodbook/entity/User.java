package com.foodbook.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
public class User {
    private String id;

    private String username;

    private String avatar;

    private String password;

    private String token;

}