package com.example.demo.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Books;

@Service
public class BooksService {
	
	@Autowired
    BooksRepository repository;
	
	public Books saveBooks(Books book) {
		return repository.save(book);
	}

	
	  public Page<Books> findAll(int pageNo, int pageSize, String sortBy, String sortDirection) {
	      Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
	      Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

	      return repository.findAll(pageable);
	  }
	  
	  public Page<Books> findAllByPrice(int pageNo, int pageSize) {
	      Sort sort = Sort.by(Sort.Direction.DESC,"bookPrice");
	      Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

	      return repository.findAll(pageable);
	  }
	  
	  
	  public Page<Books> findPageWithTwoElements(int pageNo, int pageSize) {
	      Sort sort = Sort.by(Sort.Direction.ASC,"bookAuthor");
	      Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

	      return repository.findAll(pageable);
	  }
	  
	  
	  
    }
