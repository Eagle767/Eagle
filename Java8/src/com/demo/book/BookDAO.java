package com.demo.book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getAll(){
		List<Book> books=new ArrayList<>();
		books.add(new Book(1, "Java", 20));books.add(new Book(3, "C", 30));books.add(new Book(2, "C++", 10));
		return books; 
	}

}
