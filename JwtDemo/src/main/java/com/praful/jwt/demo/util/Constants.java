/**
 * 
 */
package com.praful.jwt.demo.util;

/**
 * @author PRAFUL MESHRAM
 * @version 0.1
 * 
 *          Created Date : 10/12/2019
 * 
 *          Updated Date :
 *
 */
public class Constants {

	/**
	 * 
	 */
	public Constants() {

	}

	public static final long ACCESS_TOKEN_VALIDITY_SECONDS = 5 * 60 * 60;
	public static final String SIGNING_KEY = "prafulmeshram";
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final String AUTHORITIES_KEY = "scopes";

}
