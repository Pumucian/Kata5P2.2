package Kata5P2.model;

import java.util.logging.Logger;

public class Mails {
    private final String mail;

    public Mails(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    
    public String getDomain(){
        return mail.split("@")[1];
    }
}