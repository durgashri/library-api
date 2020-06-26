package com.test.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.app.dao.BookRepository;
import com.test.app.model.Book;
import com.test.app.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	BookRepository bookRepository;
	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getBookByCategory(long category_id) {
		return bookRepository.findByCategoryId(category_id);
	}
	
	public String updateBook(Book newBook) {
		Book book = bookRepository.findById(newBook.getId());
		book.setCategory_id(newBook.getCategory_id());
		book.setAuthor_name(newBook.getAuthor_name());
		book.setAuthor_name(newBook.getAuthor_name());
		bookRepository.save(book);
		return "Book updated successfully!";
	}
}
