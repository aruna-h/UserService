package com.bridgelabz.discoveryClient.securityservice;

import javax.mail.MessagingException;


import org.springframework.stereotype.Service;

import com.bridgelabz.discoveryClient.dto.MailDTO;
import com.bridgelabz.discoveryClient.exceptionservice.ToDoException;


/**
 * @author bridgelabz
 * @since 3/8/2018 <br>
 *        <p>
 *        interface of email security<br>
 *        </p>
 */
@Service
public interface UserEmailSecurity {
	public void sendEmail(MailDTO mailDTO) throws ToDoException, MessagingException;
}