package Mastani.portfolio_website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Mastani.portfolio_website.entity.Admin;
import Mastani.portfolio_website.service.AdminService;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public String login(@RequestBody Admin admin) {

        return adminService.login(admin);

    }

}