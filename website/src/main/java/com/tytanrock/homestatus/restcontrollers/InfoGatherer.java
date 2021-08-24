package com.tytanrock.homestatus.restcontrollers;

import com.tytanrock.homestatus.informationslice.BaseInformationSlice;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class InfoGatherer {
    @PostMapping("/sensor")
    public ResponseEntity<String> sendInformation(
            @RequestBody BaseInformationSlice info, Model model) {

        return ResponseEntity.ok().body("I didn't do anything with this");
    }
}
