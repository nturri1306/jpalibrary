package it.csa.jpalibrary;

import java.lang.reflect.Parameter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;




@Service
@ComponentScan({"it.csa.jpalibrary"})
@EntityScan("it.csa.jpalibrary")
public class MyFactoryBean {

	
    private final UserRepository  repository;
    


  
    public MyFactoryBean(final UserRepository  repository) {
        this.repository = repository;
    }

    @Bean
    public UserRepository  GetUserRepository()
    
    {
    	
    	return repository;
    }
}