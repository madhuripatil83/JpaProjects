package com.example.demoEmailService.service;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class SendOtpMailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendOtpService(String email) {

		String otp = generateOtp();
		try {
			sendOtpEmail(email,otp);
		}catch(MessagingException e) {
			throw new RuntimeException("unable to send otp");
		}

	}

	private String generateOtp() {
		SecureRandom random = new SecureRandom();
		int otp = 100000 + random.nextInt(900000);
		return String.valueOf(otp);

	}

	
	private void sendOtpEmail(String email,String otp) throws MessagingException{
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
		
		mimeMessageHelper.setTo(email);
		mimeMessageHelper.setSubject("OTP");
		mimeMessageHelper.setText(otp);
		javaMailSender.send(mimeMessage);
		
	}
}
