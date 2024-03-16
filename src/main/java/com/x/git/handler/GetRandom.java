package com.x.git.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetRandom {
    @GetMapping("/getRandom")
    public ResponseEntity<String> getRandom() {
        return ResponseEntity.status(200).body("random");
    }
}
