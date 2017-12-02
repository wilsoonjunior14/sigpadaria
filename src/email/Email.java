/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Wilson
 */
public class Email {
    
    
    public static boolean enviar(String subject,String message,String to,String email_from,String password ){
        SimpleEmail email = new SimpleEmail();
        email.setSSLOnConnect(true);
        email.setHostName( "smtp.gmail.com" );
        email.setSslSmtpPort( "465" );
        email.setAuthenticator( new DefaultAuthenticator( email_from , password ) ); // AUTENTICAÇÃO DO EMAIL 
        try {
            email.setFrom(email_from); // QUEM ESTÁ ENVIANDO

            email.setDebug(true); 

            email.setSubject(subject); // ASSUNTO DO EMAIL
            email.setMsg(message); // MENSAGEM DO EMAIL
            email.addTo(to); // PARA ONDE O EMAIL VAI

            email.send();
            return true;
        } catch (EmailException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean enviar_email_html(String to,String subject,String email_from,String password,String message){
        HtmlEmail html = new HtmlEmail();
        html.setHostName("smtp.gmail.com");
        html.setSSLOnConnect(true);
        html.setSslSmtpPort("465");
        html.setAuthenticator(new DefaultAuthenticator(email_from, password));
        try{
            html.setFrom(email_from,"SIGPADARIA");
            html.setSubject(subject);
            html.setDebug(true);
            
            StringBuilder sb = new StringBuilder();
            sb.append("<h1 style='text-align:center;font-size:30px'>SIGPADARIA</h1>");
            sb.append("<h3 style='text-align:center'>---"+subject+"---</h3>");
            sb.append("<p>"+message+"</p>");
            Calendar instance = GregorianCalendar.getInstance();
            String date = instance.getTime().toString();
            sb.append("<h4>Email gerado automaticamente pelo sistema <I>"+date+"</I></h4>");
            html.setHtmlMsg(sb.toString());
            html.addTo(to);
            html.send();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
    
    
}
