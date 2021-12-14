package com.fis.training.caseStudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.training.caseStudy.repository.Books;
import com.fis.training.caseStudy.repository.SubDto;
import com.fis.training.caseStudy.repository.Subscriptions;
import com.fis.training.caseStudy.repository.booksDto;
import com.fis.training.caseStudy.service.BookService;
import com.fis.training.caseStudy.service.SubscriptionService;

@RestController
public class libraryController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private SubscriptionService subService;
	
	@GetMapping("/Books")
	public List<booksDto> list(){
		return bookService.listAll();
	}
	
	@GetMapping("/Subscriptions")
	public List<Subscriptions> sublist(){
		return subService.listAll();
	}
	
	@PostMapping("/saveSub")
	public void saveSub(@RequestBody SubDto input) {
		subService.save(input);
	}

}
