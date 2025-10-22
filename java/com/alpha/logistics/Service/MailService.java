package com.alpha.logistics.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	
	
	@Autowired
	JavaMailSender javaMailSender;

	public void sendMail(String tomail, String subject, String content) {
		
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("jinukalasaikumar515@gmail.com");
		message.setTo(tomail);
		message.setSubject(subject);
		message.setText(content);
		
		javaMailSender.send(message);
	}


	
}
