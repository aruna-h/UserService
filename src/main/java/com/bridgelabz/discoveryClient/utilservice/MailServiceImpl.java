package com.bridgelabz.discoveryClient.utilservice;

import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.bridgelabz.discoveryClient.utilservice.rabbitmq.IProducer;
import com.bridgelabz.discoveryClient.utilservice.rabbitmq.Mail;

/**
 * @author bridgelabz
 * @since 6/08/2018 <br>
 *        <p>
 *        Entity giving implementation for the methods declared in mailService
 *        interface<br>
 *        </p>
 */
@Component
public class MailServiceImpl implements MailService {
@Autowired IProducer producer;
@Autowired Mail mail;
	@Autowired
	private JavaMailSender javaMailSender;

	public void sendMail(Mail mail) throws MessagingException {

		/*MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
*/
	/*	helper.setSubject(mail.getSubject());
		helper.setTo(mail.getTo());
		helper.setText(mail.getBody());
		javaMailSender.send(message);*/
		producer.produce(mail.getTo(), mail.getSubject(), mail.getBody());
		
	}
		
}
