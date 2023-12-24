package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.ashokit.service.BookClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		
		
		/*
		 * String url="http://localhost:8080/books"; RestTemplate rt=new RestTemplate();
		 * ResponseEntity<String> forEntity=rt.getForEntity(url, String.class); String
		 * body=forEntity.getBody(); System.out.println(body);
		 */
		  
		  BookClient bookClient = context.getBean(BookClient.class);
		 
		
		//bookClient.invokeAddBook();
		bookClient.invokeGetAllBook();
	}

}
