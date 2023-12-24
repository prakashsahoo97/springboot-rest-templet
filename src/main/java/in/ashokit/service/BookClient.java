package in.ashokit.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.Book;

@Service
public class BookClient {
	
	public void invokeAddBook() {
		String url="http://localhost:8080/book";
		
		Book b=new Book();
		b.setBookName("PHP");
		b.setBookPrice(348.85);
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> postForEntity=rt.postForEntity(url, b, String.class);
		System.out.println(postForEntity.getBody());
	}
	
	public void invokeGetAllBook() {
		String url="http://localhost:8080/books";
		RestTemplate rt=new RestTemplate();
		ResponseEntity<Book[]> getForEntity=rt.getForEntity(url, Book[].class);
		
		List<Book> bookList =Arrays.asList(getForEntity.getBody()) ;
		
		bookList.forEach(book->System.out.println(book));
	}

}
