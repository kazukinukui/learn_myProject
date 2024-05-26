package com.example.bbbbbb;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @CrossOrigin(origins = "http://localhost:3000") // ReactアプリケーションのURL
    @GetMapping("/")
    public BirthStone getBirthStone() {
        return new BirthStone("kazuki", "Dec");
    }
}
