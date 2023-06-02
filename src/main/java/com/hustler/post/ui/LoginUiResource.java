package com.hustler.post.ui;

import com.hustler.post.services.login.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("/login")
public class LoginUiResource {


    @Autowired
    private LoginService loginService;

    @PostMapping("/tikok")
    public ResponseEntity<String> Login(){
        return new ResponseEntity<>(loginService.initLogin(), HttpStatus.OK);
    }

    @PostMapping("/tiktok/callback")
    public void completeLogin() {
        log.info("login completed successfully");
    }
}
