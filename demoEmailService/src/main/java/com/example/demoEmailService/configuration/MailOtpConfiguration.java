package com.example.demoEmailService.configuration;

import java.beans.PropertyChangeSupport;
import java.security.SecureRandom;
import java.util.Properties;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Configuration
public class MailOtpConfiguration {

	@Value("${spring.mail.host}")

	private String mailHost;

	@Value("${spring.mail.port}")
	private String mailPort;

	@Value("${spring.mail.username}")
	private String mailUsername;

	@Value("${spring.mail.password}")
	private String mailPassword;

	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
		javaMailSender.setHost(mailHost);
		  try {
	            javaMailSender.setPort(Integer.parseInt(mailPort));
	        } catch (NumberFormatException e) {
	            javaMailSender.setPort(587);  // Default SMTP port for many mail servers
	        }
		javaMailSender.setUsername(mailUsername);
		javaMailSender.setPassword(mailPassword);

		Properties prop = javaMailSender.getJavaMailProperties();
		prop.put("mail.smtp.starttls.enable", "true");
		return javaMailSender;
	}

}