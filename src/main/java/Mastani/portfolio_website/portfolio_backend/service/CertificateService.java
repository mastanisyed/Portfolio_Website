package Mastani.portfolio_website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mastani.portfolio_website.entity.Certificate;
import Mastani.portfolio_website.repository.CertificateRepository;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository repository;

    public Certificate saveCertificate(Certificate certificate) {
        return repository.save(certificate);
    }

    public List<Certificate> getAllCertificates() {
        return repository.findAll();
    }

    public void deleteCertificate(Long id) {
        repository.deleteById(id);
    }
}