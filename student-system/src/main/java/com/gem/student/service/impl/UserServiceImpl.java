/**
 * 
 */
package com.gem.student.service.impl;

import com.gem.student.dao.UserDAO;
import com.gem.student.dao.impl.UserDAOImpl;
import com.gem.student.entity.User;
import com.gem.student.service.UserService;


public class UserServiceImpl implements UserService {
	private UserDAO userDAO = new UserDAOImpl();
	
	@Override
	public String checkUser(String username, String password) {
		User user = userDAO.selectOne(username);
		if (user == null) {
			return "103";//用户不存在
		} else {
			if (user.getPassword().equals(password)) {
				return "101";//登录成功
			} else {
				return "102"; //密码错误
			}
		}
	}

}
