package com.hustler.post.services.login;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginService {
    public String login() {
        return "login successful";
    }

    public String initLogin() {
        log.info("login successful");
        return "initiated";
    }
}
