package com.anil.Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LumatConfig {
	@Bean
	public Lumata getLumata()
	{
		System.out.println("in getLumata");
		return new Lumata();
	}
	
	@Bean
	public ClientA getclient()
	{
		System.out.println("in getclient");
		return new ClientA();
	}
	@Bean
	public ClientB getclientB()
	{
		System.out.println("in getclietB");
		return new ClientB();
	}

}
