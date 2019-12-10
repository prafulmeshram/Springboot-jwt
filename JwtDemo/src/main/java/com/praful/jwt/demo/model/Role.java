/**
 * 
 */
package com.praful.jwt.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author PRAFUL MESHRAM
 * @version 0.1
 * 
 *          Created Date : 10/12/2019
 * 
 *          Updated Date :
 *
 */
@Entity
@Table(name = "tab_role")
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4160450784149268243L;

	/**
	 * 
	 */
	public Role() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;

	/**
	 * @param id
	 * @param name
	 */
	public Role(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}

}
