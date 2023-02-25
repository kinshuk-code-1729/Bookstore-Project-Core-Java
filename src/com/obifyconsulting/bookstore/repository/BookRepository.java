package com.obifyconsulting.bookstore.repository;

import com.obifyconsulting.bookstore.entity.BookEntity;

public interface BookRepository {
    public Long add(BookEntity bookEntity);
    public BookEntity getDetail(Long bookID);
}
