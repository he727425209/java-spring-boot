package com.learning.learning23.service;

import com.learning.learning23.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactService {
    public boolean saveMessageDetail(Contact contact) {
        boolean saved = true;
        log.info(contact.toString());
        return saved;
    }
}
