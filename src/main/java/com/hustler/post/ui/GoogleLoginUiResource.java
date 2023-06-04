package com.hustler.post.ui;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/google")
public class GoogleLoginUiResource {
    @PostMapping("/login")
    public void initiateLogin(@RequestBody String body) {
        log.info(body);
    }

    @PostMapping("/callback")
    public void completeLogin(@RequestBody String body) {
        log.info(body);
    }

    @PostMapping("/webhook")
    public void updates(@RequestBody String body) {
        log.info(body);
    }
}
