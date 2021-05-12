package com.example.ele.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Teacher {

    private String id;
    private String name;
    private String phone;
    @JsonProperty("login_name")
    private String loginName;
    private String password;
}
