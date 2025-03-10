package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.demo.entity.Books;
import com.example.demo.repository.BooksService;

@SpringBootApplication
public class PaginationAndSortingApplication implements CommandLineRunner {
	
	@Autowired
	BooksService service;

	public static void main(String[] args) {
		SpringApplication.run(PaginationAndSortingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Books b1 = new Books();
//		b1.setBookId(111L);
//		b1.setAuthorId("100");
//		b1.setBookAuthor("Sudha Murthy");
//		b1.setBookName("Wise and Otherwise");
//		b1.setBookPrice(123.34d);
//		
//		
//		
//		Books b2 = new Books();
//		b2.setBookId(222L);
//		b2.setAuthorId("200");
//		b2.setBookAuthor("Sudha Murthy");
//		b2.setBookName("Three Thousand Stiches");
//		b2.setBookPrice(145.50d);
//		
//		
//		Books b3 = new Books();
//		b3.setBookId(333L);
//		b3.setAuthorId("300");
//		b3.setBookAuthor("Dr.APJ");
//		b3.setBookName("Wings of Fire");
//		b3.setBookPrice(300.50d);
//		
//		Books b4 = new Books();
//		b4.setBookId(444L);
//		b4.setAuthorId("400");
//		b4.setBookAuthor("Yeshwant Kanetekar");
//		b4.setBookName("Let us C");
//		b4.setBookPrice(1500.23d);
//		
//		Books b5 = new Books();
//		b5.setBookId(555L);
//		b5.setAuthorId("500");
//		b5.setBookAuthor("Elmasri and Navathe");
//		b5.setBookName("DBMS");
//		b5.setBookPrice(2500d);
		

		Books b6 = new Books();
		b6.setBookId(666L);
		b6.setAuthorId("600");
		b6.setBookAuthor("Padma");
		b6.setBookName("Finite Automata");
		b6.setBookPrice(4000d);
		

		Books b7 = new Books();
		b7.setBookId(777L);
		b7.setAuthorId("700");
		b7.setBookAuthor("Pearson");
		b7.setBookName("Operating System");
		b7.setBookPrice(550d);
		

		Books b8 = new Books();
		b8.setBookId(888L);
		b8.setAuthorId("800");
		b8.setBookAuthor("Data Structures");
		b8.setBookName("Andrew Tanenbaum");
		b8.setBookPrice(1750d);
		

		Books b9 = new Books();
		b9.setBookId(999L);
		b9.setAuthorId("900");
		b9.setBookAuthor("Dennis Ritchie");
		b9.setBookName("C programming");
		b9.setBookPrice(5000d);
		

		Books b10 = new Books();
		b10.setBookId(1111L);
		b10.setAuthorId("1000");
		b10.setBookAuthor("Balaguruswamy");
		b10.setBookName("Java Programming");
		b10.setBookPrice(3000d);
		
		//service.saveBooks(b3);
		//service.saveBooks(b4);
		
		//service.saveBooks(b3);
		//service.saveBooks(b4);
		//service.saveBooks(b5);
		
//		service.saveBooks(b6);
//		service.saveBooks(b7);
//		service.saveBooks(b8);
//		service.saveBooks(b9);
//		service.saveBooks(b10);
		
		Page<Books> result = service.findAll(0, 3, "bookId", "ASC");
		System.out.println(result.getContent());
		
		

		Page<Books> resultPrice = service.findAllByPrice(0, 5);
		System.out.println(resultPrice.getContent());
		
		Page<Books> firstPageWithTwoElements = (Page<Books>) service.findPageWithTwoElements(1, 2);
		//Pageable secondPageWithFiveElements = PageRequest.of(1, 5);
		
		System.out.println(firstPageWithTwoElements.getContent());
		
		
	}

}
