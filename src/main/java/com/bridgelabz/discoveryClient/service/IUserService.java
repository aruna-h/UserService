package com.bridgelabz.discoveryClient.service;

import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import com.bridgelabz.discoveryClient.dto.ResetPasswordDTO;
import com.bridgelabz.discoveryClient.dto.UserDto;
import com.bridgelabz.discoveryClient.exceptionservice.ToDoException;
import com.bridgelabz.discoveryClient.model.User;

/**
 * @author bridgelabz

 * @since 5/8/2018 <br>
 *        <p>
 *        an interface for userService class
 *        </p>
 */

public interface IUserService {
	/**
	 * Register the user Details in todo application
	 * 
	 * @param registerDTO
	 *            {@link RegistrationDTO} registerDTO is reference variable it has
	 *            registered user data
	 * @return 
	 * @throws RegistrationException
	 * @throws MessagingException
	 * @throws UserActivationException
	 */
	public String registerUser(UserDto userDto, String uri) throws ToDoException, MessagingException;
	/**
	 * login the user in application if the user is present
	 * 
	 * @param user
	 *            user is reference variable
	 * @return 
	 * @throws LoginException
	 * @throws MessagingException
	 * @throws UserActivationException
	 * @throws ToDoException 
	 */
	public String loginUser(UserDto userDto, String uri) throws ToDoException, MessagingException;

	/**
	 * @param token
	 * @throws UserActivationException
	 */
	public void setActivationStatus(String token) throws ToDoException;

	/**
	 * @param resetPasswordDTO
	 * @param token
	 * @throws UserActivationException
	 * @throws RegistrationException
	 */
	public void resetPassword(ResetPasswordDTO resetPasswordDTO, String token)
			throws ToDoException;

	/**
	 * @param emailId
	 * @param uri
	 * @throws RegistrationException
	 * @throws MessagingException
	 */
	public void forgotPassword(String emailId, String uri) throws ToDoException, MessagingException;
	
	

	List<?> getAllUsers();
	

	
	
	

}