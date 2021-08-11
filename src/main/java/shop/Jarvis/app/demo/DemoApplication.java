package shop.Jarvis.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shop.Jarvis.app.demo.calculator.entity.User;
import shop.Jarvis.app.demo.calculator.repository.UserRepository;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		userRepository.save(new User("a", "Alice", "a@a", "1"));
		userRepository.save(new User("b", "Bob", "b@b", "1"));
		userRepository.save(new User("c", "Bob", "c@c", "1"));
		List<User> users = userRepository.findAll();
		System.out.println("Print All Users");
		for (User u : users) {
			System.out.println(u.toString());
		}
		System.out.println("Print Only Bob");
		for (User u : userRepository.findAllByName("Bob")) {
			System.out.println(u.toString());
		}
	}
}
