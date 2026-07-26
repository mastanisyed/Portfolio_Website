package Mastani.portfolio_website.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mastani.portfolio_website.entity.Admin;
import Mastani.portfolio_website.repository.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public String login(Admin admin) {

        Admin existingAdmin = adminRepository
                .findByUsername(admin.getUsername())
                .orElse(null);

        if (existingAdmin == null) {
            return "Username Not Found";
        }

        if (existingAdmin.getPassword().equals(admin.getPassword())) {
            return "Login Successful";
        }

        return "Invalid Password";
    }
}