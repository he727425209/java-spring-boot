package com.learning.learning32.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Contact extends BaseEntity{
    private int contactId;
    private String name;
    private String mobileNum;
    private String email;
    private String subject;
    private String message;
    private String status;
}
