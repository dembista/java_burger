package com.example.java_burger_teste;

import com.example.java_burger_teste.fixtures.BurgerFixeture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBurgerTesteApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(JavaBurgerTesteApplication.class, args);
	}
	@Autowired
	private BurgerFixeture bf;

	@Override
	public void run(String... args) throws Exception {
		//bf.load();
	}
}
