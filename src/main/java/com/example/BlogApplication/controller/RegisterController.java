package com.example.BlogApplication.controller;

import com.example.BlogApplication.models.Account;
import com.example.BlogApplication.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class RegisterController {

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping ("/register")
    public String getRegisterPage(@RequestBody Account account){
        try {
            accountRepository.save(account);
            return "User Have been Added";
        }catch (Error e){
            return "Error when trying to add the new account";
        }

    }
}
