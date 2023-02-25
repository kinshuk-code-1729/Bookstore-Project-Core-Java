package com.obifyconsulting.bookstore.controller;

import com.obifyconsulting.bookstore.dto.BookDTO;
import com.obifyconsulting.bookstore.service.BookService;
import com.obifyconsulting.bookstore.service.impl.BookServiceImpl;

public class BookController {
    private BookService bookService;
    public BookController(){
//        RUNTIME or Dynamic Polymorphism
        this.bookService = new BookServiceImpl();
    }
    public Long add(BookDTO bookDTO) {
//        Call to the service layer method
       return this.bookService.add(bookDTO);
    }
    public BookDTO getBook(Long bookID){
        return this.bookService.getBook(bookID);
    }
}
