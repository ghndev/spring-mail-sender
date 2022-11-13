package com.example.springmailsender.controller;

import com.example.springmailsender.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.mail.MessagingException;

@Controller
@RequiredArgsConstructor
public class MailController {

    private final MailService mailService;

    @GetMapping
    public String home() {
        return "mail";
    }

    @PostMapping
    public String send(@RequestParam String email) throws MessagingException {
        mailService.sendMail(email);

        return "redirect:/";
    }
}
