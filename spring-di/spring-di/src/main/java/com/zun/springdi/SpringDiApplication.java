package com.zun.springdi;

import com.zun.springdi.controllers.ConstructorInjectedController;
import com.zun.springdi.controllers.MyController;
import com.zun.springdi.controllers.PropertyInjectedController;
import com.zun.springdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		MyController myController = ctx.getBean(MyController.class, "myController");
		System.out.println(myController.sayHello());
		PropertyInjectedController propController = ctx.getBean(PropertyInjectedController.class, "propController");
		System.out.println(propController.getGreeting());
		SetterInjectedController setterController = ctx.getBean(SetterInjectedController.class, "setterController");
		System.out.println(setterController.getGreeting());
		ConstructorInjectedController consController = ctx.getBean(ConstructorInjectedController.class, "consController");
		System.out.println(consController.getGreeting());
		System.out.println(myController.getGreeting());
	}

}
