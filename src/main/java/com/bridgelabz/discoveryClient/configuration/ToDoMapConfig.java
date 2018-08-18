package com.bridgelabz.discoveryClient.configuration;

import org.modelmapper.ModelMapper;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

/**
 * @author bridgelabz
 * @since 2/08/2018 <br>
 *        <p>
 *        Entity of mapping configuration 
 *       <br>
 *        </p>
 */
@Configuration
@ComponentScan("com.bridgelabz.todoapp")
public class ToDoMapConfig {

	@Bean
	public ModelMapper model() {
		return new ModelMapper();
	}
}
