package com.test.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.app.model.Book;
import com.test.app.service.BookService;

@RestController
@RequestMapping("/library")
public class LibraryController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();	
	}
		
	@GetMapping("/getBook")
	public List<Book> getBookByCategory(@RequestParam long category_id){
		return bookService.getBookByCategory(category_id);	
	}
	
	@PutMapping("/updateBook")
	public String updateBook(@RequestBody Book newBook){
		return bookService.updateBook(newBook);
	}
}
