package com.bridgelabz.discoveryClient.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author bridgelabz
 * @since 4/8/2018 <br>
 *        <p>
 *        a business entity giving info about response
 *        </p>
 */
@SuppressWarnings("serial")
@Document
public class ResponseDTO implements Serializable {
	@Id
	private int status;
	private String message;

	public ResponseDTO() {

	}

	public ResponseDTO(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int i) {
		this.status = i;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
