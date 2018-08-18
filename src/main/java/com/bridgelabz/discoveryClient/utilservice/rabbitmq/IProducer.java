package com.bridgelabz.discoveryClient.utilservice.rabbitmq;
/**
 * @author bridgelabz
 * @since 5/08/2018 <br>
 *        <p>
 *        Entity of producer interface<br>
 *        </p>
 */
public interface IProducer {
	/**
	 * a method declaration to produce message by the producer
	 * @param to
	 * @param subject
	 * @param body
	 */
	public void produce(String to,String subject,String body);
}
