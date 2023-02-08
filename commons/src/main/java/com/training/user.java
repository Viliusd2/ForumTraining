package com.training;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class user {

    private String email;
    private String username;
    private Integer age;
    private String password;
    private List<manga> readingList;

}
