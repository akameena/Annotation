package com.anil.Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Lumata {
	@Autowired // this is  used for  getting object without using any config class
	Client client; // here client getting object using autowired annotation 
	@Autowired
	ClientB clientb;
	public void tech() {
		
		System.out.println("we are working on java tech");
		client.Work();
		clientb.sayHello();
	}
	
}
