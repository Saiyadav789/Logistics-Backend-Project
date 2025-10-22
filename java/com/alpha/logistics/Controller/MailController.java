package com.alpha.logistics.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.logistics.Service.MailService;

@RestController

public class MailController {
	
	@Autowired
	MailService mailServ;

	@PostMapping("/sendmail")
	public void sendmail() {
		String tomail="jinukalasaikumar515@gmail.com";
		String subject="This is Sample Mail";
		String content="This is Dummy Mail Please Ignore";
		
		mailServ.sendMail(tomail,subject,content);
	}
	
}
