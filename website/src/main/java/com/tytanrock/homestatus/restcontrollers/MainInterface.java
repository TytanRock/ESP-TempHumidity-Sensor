package com.tytanrock.homestatus.restcontrollers;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class MainInterface {
    @GetMapping("/")
    public ResponseEntity<String> sendInformation(Model model) {

        return ResponseEntity.ok().body("I'll figure out what to put here later...");
    }
}
