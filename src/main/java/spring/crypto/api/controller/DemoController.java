package spring.crypto.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feel free to remove this class and create your own.
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo() {
        return "demo!";
    }
}
