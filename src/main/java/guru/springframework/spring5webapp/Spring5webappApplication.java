package guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
/*		SpringApplication.run(Spring5webappApplication.class, args);
	}
*/
	ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);
	displayRepositoryBeans(ctx);
}

	public static void displayRepositoryBeans(ApplicationContext ctx) {
		Arrays.asList(ctx.getBeanDefinitionNames())
				.stream()
				.filter(line -> line.contains("Repository"))
				.forEach(repo -> System.out.println("Repo: " + repo));
	}
}
