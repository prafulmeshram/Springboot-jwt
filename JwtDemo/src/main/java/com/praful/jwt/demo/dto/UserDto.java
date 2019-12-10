/**
 * 
 */
package com.praful.jwt.demo.dto;

/**
 * @author PRAFUL MESHRAM
 * @version 0.1
 * 
 *          Created Date : 10/12/2019
 * 
 *          Updated Date :
 *
 */
public class UserDto {

	/**
	 * 
	 */
	public UserDto() {

	}

	private String username;

	private String password;

	private String email;

	private String mobileNumber;

	/**
	 * @param username
	 * @param password
	 * @param email
	 * @param mobileNumber
	 */
	public UserDto(String username, String password, String email, String mobileNumber) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
