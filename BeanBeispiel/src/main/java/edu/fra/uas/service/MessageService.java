package edu.fra.uas.service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import edu.fra.uas.BeanBeispielApplication;

import org.slf4j.Logger;

@Component
public class MessageService {
    private String message;
    private int counter = 0;
    private static final Logger log =LoggerFactory.getLogger(BeanBeispielApplication.class);
   

    public String getMessage() {
        log.debug("recieve Message");
        return message;
    }

    public void setMessage(String message) {
        log.debug("Message set");
        this.message = message;
    }

    public int increment() {
        counter ++;
        log.debug("counter increment to: " + counter);
        return counter;
    }
}
