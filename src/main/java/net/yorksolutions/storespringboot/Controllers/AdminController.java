package net.yorksolutions.storespringboot.Controllers;

import net.yorksolutions.storespringboot.Services.AccountService;
import net.yorksolutions.storespringboot.Services.AdminService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    private AdminService adminservice;

    public AdminController(AdminService adminservice){
        this.adminservice = adminservice;
    }

    @PostMapping
    public void addAdmin(@RequestParam String adminName) {
        adminservice.addAdmin(adminName);
    }

    @PutMapping
    public void addManageAccount(@RequestParam Long admin_id, @RequestParam Long account_id) {
        adminservice.addManageAccount(admin_id, account_id);
    }

}
