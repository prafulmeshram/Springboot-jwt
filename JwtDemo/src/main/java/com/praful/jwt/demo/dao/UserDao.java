/**
 * 
 */
package com.praful.jwt.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

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
@Repository
public interface UserDao extends CrudRepository<User, Long> {

	User findByUsername(String username);

}
