package com.demo.book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	List<Book> books=new BookDAO().getAll();
	
	public List<Book> getSortById(){
		Collections.sort(books, new MyComparator());
		return books;
	}
	
	public List<Book> getSortByName(){
		Collections.sort(books,new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {return o2.getName().compareTo(o1.getName());}	
		});
		return books;
	}
	
	public List<Book> getSortByPages(){
		Collections.sort(books, (o1,o2)->o2.getPages()-o1.getPages());
		return books;
	}
	
	public static void main(String[] args) {
		BookService bookService=new  BookService();
		System.out.println(bookService.getSortById());
		System.out.println(bookService.getSortByName());
		System.out.println(bookService.getSortByPages());
	}

}

class MyComparator implements Comparator<Book>{

//	@Override  //acsending
//	public int compare(Book o1, Book o2) {return o1.getName().compareTo(o2.getName());}
	
	@Override  //desending
	public int compare(Book o1, Book o2) {return o2.getId()-o1.getId();}
	
}
