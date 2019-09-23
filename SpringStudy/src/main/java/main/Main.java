package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Main {

	public static void main(String[] args) {
		
		String[] files = new String[]{"resources/car.xml", "resources/engine.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(files);
		Car car = context.getBean("car", Car.class);
		car.printCarDetails();
		((ConfigurableApplicationContext) context).close();

		//Resource r = new ClassPathResource("resources/car.xml");
		/*BeanFactory factory = new XmlBeanFactory(r);
		HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");
		HelloWorld helloWorld1 = (HelloWorld) factory.getBean("helloWorld");
		HelloWorld helloWorld2 = (HelloWorld) factory.getBean("helloWorld");
		System.out.println(helloWorld == helloWorld1);
		System.out.println(helloWorld2 == helloWorld1);
		helloWorld.display();*/

		//System.out.println(car.getMap());
		
		/*HelloWorld h2 = (HelloWorld) context.getBean("helloWorld");
		h1.display();
		System.out.println(h1 == h2);*/
	}
}