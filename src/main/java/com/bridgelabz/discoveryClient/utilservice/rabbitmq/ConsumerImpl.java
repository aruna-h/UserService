package com.bridgelabz.discoveryClient.utilservice.rabbitmq;

import javax.mail.MessagingException;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgelabz.discoveryClient.utilservice.MailService;


/**
 * @author bridgelabz
 * @since 5/08/2018 <br>
 *        <p>
 *        Entity giving implementation of consumer and consumer is the one who
 *        receives the message. <br>
 *        </p>
 */
@Component
public class ConsumerImpl implements IConsumer {

	@Autowired
	MailService mailService;
	@Override
	@RabbitListener(queues = "${Todo.rabbitmq.queue}")
	public void recieve(Mail email) throws MessagingException {
		//System.out.println("Recieved Message: " + email);
		String to = email.getTo();
		String subject = email.getSubject();
		String body = email.getBody();
		mailService.sendMail(email);
		// mailService.sendMail(to,subject,body);
	}

}
