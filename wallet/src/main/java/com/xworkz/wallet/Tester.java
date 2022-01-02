package com.xworkz.wallet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		String springConfigFile = "applicationContext.xml";

		ApplicationContext springContainer = new ClassPathXmlApplicationContext(springConfigFile);
		System.out.println("springContainer is created " + springContainer.hashCode());

		Wallet wallet = springContainer.getBean(Wallet.class); // Method overloading example
		System.out.println("Wallet is : " + wallet);
		
		Material material = springContainer.getBean(Material.class);
		System.out.println("Material : "+material);
		
		Money money = springContainer.getBean(Money.class);
		System.out.println("Money : "+money);
		
		ATMCard atmCard = springContainer.getBean(ATMCard.class);
		System.out.println("ATMCard : "+atmCard);
		
		Photo photo=springContainer.getBean(Photo.class);
		System.out.println("Photo : "+photo);
		
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext=(ClassPathXmlApplicationContext) springContainer;
		classPathXmlApplicationContext.close();
		
		
		/*Object object = springContainer.getBean("wallet"); // Method overloading example
		System.out.println("Object " + object);

		Wallet w = (Wallet) object;
		System.out.println("Object after downcasting " + w);
*/
	}

}
