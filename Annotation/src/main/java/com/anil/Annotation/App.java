package com.anil.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	
	/* @Autowired
     ClientB clientb2*/;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ac = new AnnotationConfigApplicationContext(LumatConfig.class);
        System.out.println( "Hello World2" );
        Lumata lum = ac.getBean(Lumata.class);// both object are getting from LumataConfig file
        System.out.println( "Hello World3" );
        ClientA ca = ac.getBean(ClientA.class);
        ca.sayHello();
       
       
        lum.tech();
        App app = new App();
        ClientB clientb = ac.getBean(ClientB.class);
        clientb.sayHello();
        app.call();
        
     
        
    }
    public void call()
    {
    	System.out.println("in call method");
    	//clientb2.sayHello();      
    	
        
    }
}
