package com.bridgelabz.D01_Spring_boot_Security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/msg")
    public String getMessage()
    {
        return " **** @@ Good Morning @@ **** \n ##(Base Authentication)## \n Basic Security Acheive Successfully ..... ";
    }
}
