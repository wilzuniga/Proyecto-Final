package Correo;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;

public class LinkMail extends MimeMessage{    
    public LinkMail(Session session) {
        super(session);
    }
}
