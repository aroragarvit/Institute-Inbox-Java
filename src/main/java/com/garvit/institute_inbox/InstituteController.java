package com.garvit.institute_inbox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstituteController {
    @GetMapping("/") 
    public String hello() {
        return "Hello World!";
    }
}
