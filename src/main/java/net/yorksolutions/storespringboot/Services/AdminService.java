package net.yorksolutions.storespringboot.Services;

import net.yorksolutions.storespringboot.Entity.Admin;
import net.yorksolutions.storespringboot.Repositories.AccountRepository;
import net.yorksolutions.storespringboot.Repositories.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository adminRepository;
    private final AccountRepository accountRepository;

    public AdminService( AdminRepository adminRepository, AccountRepository accountRepository){
        this.adminRepository = adminRepository;
        this.accountRepository = accountRepository;

    }
    public void addAdmin(String adminName){
        adminRepository.save(new Admin(adminName));
    }

    public void addManageAccount(Long account_id, Long admin_id){
//        Get the Account associated with the account_id
       final var account = accountRepository.findById(account_id).orElseThrow();
       final var admin = adminRepository.findById(admin_id).orElseThrow();
       admin.managesAccounts.add(account);
       adminRepository.save(admin);
    }
//    public Iterable<Admin>getAll(){
//        return adminRepository.findAll();
//    }



}
