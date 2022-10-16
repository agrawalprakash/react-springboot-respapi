package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import net.javaguides.springboot.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.springboot.repository.UserRepository;

@SpringBootApplication
public class ReactSpringbootRespapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringbootRespapiApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		this.userRepository.save(new User("Prakash", "Agrawal", "prakash1@gmail.com"));
		this.userRepository.save(new User("Tony", "Shark", "tony1@gmail.com"));
		this.userRepository.save(new User("Tom", "Cruise", "tom1@gmail.com"));
		
	}

}
