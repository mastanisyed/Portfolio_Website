package Mastani.portfolio_website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Mastani.portfolio_website.entity.Contact;
import Mastani.portfolio_website.repository.ContactRepository;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // Save Contact
    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }

    // Get All Contacts
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    // Delete Contact
public void deleteContact(Long id) {

    contactRepository.deleteById(id);

}

}