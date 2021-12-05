/**
 * 
 */
package com.gem.student.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.gem.student.entity.Student;


public interface StudentService {
	/**
	 * 	查询学生列表
	 */
	List<Student> findAll(String sname);
	
	/**
	 * 	删除学生
	 */
	void deleteStudent(String ids);
	
	/**
	 *  	保存学生记录
	 */
	void save(HttpServletRequest request);
	 
	/**
	 *  查询学生
	 */
	Student findOne(Integer id);
}
