package com.michael.springbootpractice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.michael.springbootpractice.model.User;
import com.michael.springbootpractice.persistence.UserRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootpracticeApplicationTests {

	@Autowired
	UserRepository ur;
	
	
	@Test
	public void contextLoads() {
		
		User a = new User("张三", 35);
		System.out.println(a);
		ur.save(a);
		System.out.println(a);
	}

}
