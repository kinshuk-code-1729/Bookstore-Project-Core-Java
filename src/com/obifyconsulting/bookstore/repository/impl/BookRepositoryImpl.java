package com.obifyconsulting.bookstore.repository.impl;

import com.obifyconsulting.bookstore.entity.BookEntity;
import com.obifyconsulting.bookstore.repository.BookRepository;
import com.obifyconsulting.bookstore.serdeser.BookSerializer;

import java.awt.print.Book;
import java.util.List;
import java.util.ArrayList;

public class BookRepositoryImpl implements BookRepository {
    @Override
    public Long add(BookEntity bookEntity){
        BookSerializer.serializeBook(bookEntity);
        return bookEntity.getBookID();
    }

    @Override
    public BookEntity getDetail(Long bookID) {
        BookEntity BEnt = BookSerializer.deserializeBook(bookID);
        return BEnt;
    }
}
