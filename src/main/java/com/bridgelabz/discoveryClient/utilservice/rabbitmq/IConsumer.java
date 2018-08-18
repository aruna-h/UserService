package com.bridgelabz.discoveryClient.utilservice.rabbitmq;



import javax.mail.MessagingException;


import com.bridgelabz.discoveryClient.exceptionservice.ToDoException;

/**
 * @author bridgelabz
 * @since 5/08/2018 <br>
 *        <p>
 *        Entity of consumer interface<br>
 *        </p>
 */
public interface IConsumer {
	/**
	 * a method declaration for consumer receiving message
	 * 
	 * @param email
	 * @throws MessagingException
	 * @throws ToDoException 
	 */
	void recieve(Mail email) throws MessagingException, MessagingException, ToDoException;
}
