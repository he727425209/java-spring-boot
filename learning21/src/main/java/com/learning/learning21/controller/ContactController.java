package com.learning.learning21.controller;

import com.learning.learning21.model.Contact;
import com.learning.learning21.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
    private static Logger logger = LoggerFactory.getLogger(ContactController.class);

    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/contact")
    public String displayContactPage() {
        return "contact.html";
    }

    @PostMapping(value = "/saveMsg")
    public ModelAndView saveMessage(Contact contact) {
        contactService.saveMessageDetail(contact);
        return new ModelAndView("redirect:/contact");
    }
}
