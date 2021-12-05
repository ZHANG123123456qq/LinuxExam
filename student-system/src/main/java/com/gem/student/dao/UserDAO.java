/**
 * 
 */
package com.gem.student.dao;

import com.gem.student.entity.User;



public interface UserDAO {
	/**
	 * 	根据用户名查询
	 */
	User selectOne(String username);
}
