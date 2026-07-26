package Mastani.portfolio_website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Mastani.portfolio_website.dto.DashboardResponse;
import Mastani.portfolio_website.repository.AdminRepository;
import Mastani.portfolio_website.repository.CertificateRepository;
import Mastani.portfolio_website.repository.ContactRepository;
import Mastani.portfolio_website.repository.ProjectRepository;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin(origins = "*")
public class DashboardController {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private CertificateRepository certificateRepository;

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping("/stats")
    public DashboardResponse getDashboardStats() {

        return new DashboardResponse(
                contactRepository.count(),
                projectRepository.count(),
                certificateRepository.count(),
                adminRepository.count()
        );
    }
}