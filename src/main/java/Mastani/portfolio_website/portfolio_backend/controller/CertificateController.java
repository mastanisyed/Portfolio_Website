package Mastani.portfolio_website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Mastani.portfolio_website.entity.Certificate;
import Mastani.portfolio_website.service.CertificateService;

@RestController
@RequestMapping("/api/certificates")
@CrossOrigin(origins = "*")
public class CertificateController {

    @Autowired
    private CertificateService service;

    @PostMapping
    public Certificate saveCertificate(@RequestBody Certificate certificate) {
        return service.saveCertificate(certificate);
    }

    @GetMapping
    public List<Certificate> getAllCertificates() {
        return service.getAllCertificates();
    }

    @DeleteMapping("/{id}")
    public String deleteCertificate(@PathVariable Long id) {
        service.deleteCertificate(id);
        return "Certificate Deleted Successfully";
    }
}