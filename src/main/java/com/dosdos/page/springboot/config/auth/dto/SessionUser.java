package com.dosdos.page.springboot.config.auth.dto;

import com.dosdos.page.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.name;
        this.email = user.email;
        this.picture = user.picture;
    }
}
