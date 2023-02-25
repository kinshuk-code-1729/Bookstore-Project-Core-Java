package com.obifyconsulting.bookstore.service.impl;

import com.obifyconsulting.bookstore.converter.BookConverter;
import com.obifyconsulting.bookstore.dto.BookDTO;
import com.obifyconsulting.bookstore.entity.BookEntity;
import com.obifyconsulting.bookstore.repository.BookRepository;
import com.obifyconsulting.bookstore.repository.impl.BookRepositoryImpl;
import com.obifyconsulting.bookstore.service.BookService;

public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    public BookServiceImpl(){
        this.bookRepository = new BookRepositoryImpl();
    }
    @Override
    public Long add(BookDTO bookDTO){
//     Convert the DTO to Repository compatable Entity class
//     ADAPTER DESIGN PATTERN
        BookEntity bookEntity = BookConverter.conv_DTO_to_Entity(bookDTO);
        return this.bookRepository.add(bookEntity);
    }

    @Override
    public BookDTO getBook(Long bookID) {
        BookEntity bookEntity = this.bookRepository.getDetail(bookID);
        BookDTO bookDTO = BookConverter.conv_Entity_to_DTO(bookEntity);
        return bookDTO;
    }
}
