package com.kitakun.crud_simple_app;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {

        try {
            var ip = InetAddress.getLocalHost();

            return String.format("Hello from spring! wow, amazing! IP=%s", ip);
        } catch (UnknownHostException e) {
            return String.format("Error: %s", e.getMessage());
        }
    }
}
