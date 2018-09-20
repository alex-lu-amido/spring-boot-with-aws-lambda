package com.amido.poc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {

    @RequestMapping("/hello")
    public String hello() {
        log.info("Hitting hello endpoint");
        return "Hello from Spring via Lambda";
    }

}
