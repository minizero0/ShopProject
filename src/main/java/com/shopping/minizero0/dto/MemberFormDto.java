package com.shopping.minizero0.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberFormDto {
@NotNull
    private String name;

    private String email;

    private String password;

    private String address;
}
