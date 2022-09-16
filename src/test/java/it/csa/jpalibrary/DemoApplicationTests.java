package it.csa.jpalibrary;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {
	
	
	@Autowired
	MyFactoryBean myFactoryBean;
	



	  
	@Test
	void contextLoads() {
		
		
		
	}
	
	
	@Test
	
	void testService()
	{
		
		//System.out.println(myService.));
		
	}



	
	@Test
	
	void testBean()
	{
		
		User user = new User();
		
		user.setId(1);
		user.setName("nicola");
		user.setEmail("nturri1306@gmail.com");
		
		myFactoryBean.GetUserRepository().save(user);
		 
		System.out.println("count: "+ myFactoryBean.GetUserRepository().findAll().size());
		 
		
	}
}
