package net.yorksolutions.storespringboot.Services;

import net.yorksolutions.storespringboot.Entity.Account;
import net.yorksolutions.storespringboot.Repositories.AccountRepository;
import net.yorksolutions.storespringboot.dto.NewAccountRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class AccountService {

    AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    public Account create(NewAccountRequestDTO requestDTO){
        try{
            return this.accountRepository.save(
                    new Account(requestDTO.username, requestDTO.password));
        } catch (RuntimeException exception){
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
//        try and catch the error
//        save-saves the data to db or updates to the same row
    }

    public Account login(String username, String password){
        Optional<Account> accountOpt = this.accountRepository.findByUsernameAndPassword(username,password);
        if(accountOpt.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return accountOpt.get();

    }
}
