package com.test.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.app.model.Book;

@Service
public interface BookService {
	public List<Book> getAllBooks();
	public List<Book> getBookByCategory(long category_id);
	public String updateBook(Book newBook);
}
