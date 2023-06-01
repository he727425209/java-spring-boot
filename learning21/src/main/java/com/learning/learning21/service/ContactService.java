package com.learning.learning21.service;

import com.learning.learning21.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private Logger logger = LoggerFactory.getLogger(ContactService.class);
    public boolean saveMessageDetail(Contact contact) {
        boolean saved = true;
        logger.info(contact.toString());
        return saved;
    }
}
