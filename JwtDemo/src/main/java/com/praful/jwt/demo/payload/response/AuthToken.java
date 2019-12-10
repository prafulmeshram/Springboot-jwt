/**
 * 
 */
package com.praful.jwt.demo.payload.response;

/**
 * @author PRAFUL MESHRAM
 * @version 0.1
 *
 *          Created Date : 10/12/2019
 * 
 *          Updated Date
 */
public class AuthToken {

	/**
	 * 
	 */
	public AuthToken() {

	}

	private String token;

	/**
	 * @param token
	 */
	public AuthToken(String token) {
		this.token = token;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

}
