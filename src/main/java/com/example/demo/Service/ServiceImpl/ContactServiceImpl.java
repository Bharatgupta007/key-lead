package com.example.demo.Service.ServiceImpl;

import com.example.demo.Model.Contact;
import com.example.demo.Repository.ContactRepo;
import com.example.demo.Service.ContactService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepo contactRepo;

    public ContactServiceImpl(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    @Override
    @Transactional
    public Contact saveContact(Contact contact) {
        return contactRepo.save(contact);
    }
}
