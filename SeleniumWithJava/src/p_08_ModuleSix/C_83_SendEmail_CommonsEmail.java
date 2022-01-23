package p_08_ModuleSix;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class C_83_SendEmail_CommonsEmail {

	public static void main(String[] args) throws EmailException{
		
		System.out.println("Email sending start.");

		Email email = new SimpleEmail();
		
		email.setHostName("smtp.gmail.com");
		
		email.setSmtpPort(465);
		
		email.setAuthenticator(new DefaultAuthenticator("abcd@gmail.com", "Test@1234"));
		
		email.setSSLOnConnect(true);
		
		email.setFrom("abcd@gmail.com");
		
		email.setSubject("Test Email by Selenium");
		
		email.setMsg("Hi! This is a test mail from Md. Mahfuz-Ul-Alam Badhan");
		
		email.addTo("malambadhan1995@gmail.com");
		
		email.send();
		
		System.out.println("Congratulations! Emai sent successfully and the test case passed.");
		
	}

}
