/**
 * 
 */
package com.gem.student.dao;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.gem.student.dao.impl.StudentDAOImpl;
import com.gem.student.entity.Student;
import redis.clients.jedis.Jedis;

/**
 * @author: jzhang
 * @QQ: 1104975916
 * @CreateDate: 2019年12月25日 上午8:58:21
 * @Description: 
 */
public class StudentDAOTest {
	private StudentDAO studentDAO;
	private Jedis jedis;
	
	@Before
	public void setUp() throws Exception {
		studentDAO = new StudentDAOImpl();
	}

	@Test
	public void testSelectAll() {
		studentDAO.selectAll("小").forEach(System.out::println);
	}
	
	@Test
	public void testDeleteBatch() {
		Integer[] ids = new Integer[] {1,2,3};
		studentDAO.deleteBatch(ids);
	}
	
	@Test
	public void testInsert() {
		Student student = new Student("小刘","20","M",new Date());
		studentDAO.insert(student);
	}

	@Test
	public void j(){
		jedis=new Jedis("114.55.7.3",6379,100000);
		System.out.println(jedis.ping());
	}

}
