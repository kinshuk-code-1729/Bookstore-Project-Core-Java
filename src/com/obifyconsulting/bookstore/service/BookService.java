package com.obifyconsulting.bookstore.service;

import com.obifyconsulting.bookstore.dto.BookDTO;

public interface BookService {
    public Long add(BookDTO bookDTO);
    public BookDTO getBook(Long bookID);
}
