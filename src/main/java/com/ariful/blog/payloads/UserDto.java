package com.ariful.blog.payloads;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@NoArgsConstructor
@Data
public class UserDto {
    private int id;
    private String name;
    private String email;
    private String password;
    private String about;
}
