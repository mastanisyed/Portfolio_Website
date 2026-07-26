package Mastani.portfolio_website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Mastani.portfolio_website.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}