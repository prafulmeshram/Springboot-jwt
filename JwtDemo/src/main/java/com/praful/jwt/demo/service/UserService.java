/**
 * 
 */
package com.praful.jwt.demo.service;

import java.util.List;

import com.praful.jwt.demo.dto.UserDto;
import com.praful.jwt.demo.model.User;

/**
 * @author PRAFUL MESHRAM
 * @version 0.1
 * 
 *          Created Date : 10/12/2019
 * 
 *          Updated Date :
 *
 */

public interface UserService {

	User save(UserDto user);

	List<User> findAll();

	void delete(long id);

	User findOne(String username);

	User findById(Long id);

}
