package com.xworkz.cctv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		/*
		 * CCTV cctv = new CCTV();
		 * 
		 * CCTV cctv = new CCTV("MI", 12, 2500.00, "Black");
		 * 
		 * System.out.println("Object Address " + cctv);
		 * 
		 * System.out.println("cctv.brand :- " + cctv.brand);
		 * System.out.println("cctv.cameraSize :- " + cctv.cameraSize);
		 * System.out.println("cctv.color :- " + cctv.color);
		 * System.out.println("cctv.price :- " + cctv.price);
		 */
		String springConfigFile = "spring.xml";
		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springConfigFile);
		System.out.println("springContainer is created " + springContainer.hashCode());

		CCTV cctv = springContainer.getBean(CCTV.class);
		System.out.println(cctv.getBrand());
		System.out.println(cctv.getCameraSize());
		System.out.println(cctv.getPrice());
		System.out.println(cctv.getColor());

		cctv.record();
		cctv.autoDelete();

		String string = springContainer.getBean(String.class);
		System.out.println("String object is created");
		System.out.println("String is : "+string);

		Integer integer = springContainer.getBean(Integer.class);
		System.out.println("Integer object is created");
		System.out.println("integer is :" + integer);

		Double double1 = springContainer.getBean(Double.class);
		System.out.println("Double object is created");
		System.out.println("Double is :" + double1);

		Float float1 = springContainer.getBean(Float.class);
		System.out.println("Invoked Float");
		System.out.println("Float is : " + float1);

		Short short1 = springContainer.getBean(Short.class);
		System.out.println("Invoked Short");
		System.out.println("Short is : " + short1);

		Byte byte1 = springContainer.getBean(Byte.class);
		System.out.println("Invoked Byte");
		System.out.println("Byte is : " + byte1);

		Boolean boolean1 = springContainer.getBean(Boolean.class);
		System.out.println("Invoked Boolean");
		System.out.println("Boolean is : " + boolean1);

		Long long1 = springContainer.getBean(Long.class);
		System.out.println("Invoked Long");
		System.out.println("Long is : " + long1);

	}

}
