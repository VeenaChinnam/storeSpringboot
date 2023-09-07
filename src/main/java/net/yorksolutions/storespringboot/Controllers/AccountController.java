package net.yorksolutions.storespringboot.Controllers;

import net.yorksolutions.storespringboot.Entity.Account;
import net.yorksolutions.storespringboot.Services.AccountService;
import net.yorksolutions.storespringboot.dto.NewAccountRequestDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
@CrossOrigin
public class AccountController {
    AccountService accountService;
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @PostMapping
    public Account create(@RequestBody NewAccountRequestDTO requestDTO){
        return this.accountService.create(requestDTO);
    }

    @GetMapping
    public Account login(@RequestParam String username,@RequestParam String password){
        return this.accountService.login(username,password);
    }


}
