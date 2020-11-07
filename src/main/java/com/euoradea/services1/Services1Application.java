package com.euoradea.services1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.joda.time.LocalTime;

@SpringBootApplication
public class Services1Application {

	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("Current time is + " + currentTime);

		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}
