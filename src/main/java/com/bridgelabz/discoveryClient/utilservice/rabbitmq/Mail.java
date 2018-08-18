package com.bridgelabz.discoveryClient.utilservice.rabbitmq;

import org.springframework.stereotype.Component;

/**
 * @author bridgelabz
 * @since 5/08/2018 <br>
 *        <p>
 *        Business entity containing information about Mail <br>
 *        </p>
 */
@Component
public class Mail {
	private String to;
	private String subject;
	private String body;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Mail [to=" + to + ", subject=" + subject + ", body=" + body + "]";
	}
	

}
