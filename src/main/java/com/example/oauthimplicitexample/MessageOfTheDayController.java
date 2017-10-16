package com.example.oauthimplicitexample;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MessageOfTheDayController {

    @GetMapping("/mod")
    @PreAuthorize("hasAuthority('Everyone') || #oauth2.hasScope('email')")
    public String getMessageOfTheDay(Principal principal) {
        return "The message of the day is boring for user: " + principal.getName();
    }
}
