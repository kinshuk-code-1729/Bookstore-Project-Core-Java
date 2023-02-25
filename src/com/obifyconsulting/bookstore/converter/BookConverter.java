package com.obifyconsulting.bookstore.converter;

import com.obifyconsulting.bookstore.dto.BookDTO;
import com.obifyconsulting.bookstore.entity.BookEntity;

public class BookConverter {
    public static BookEntity conv_DTO_to_Entity(BookDTO bookDTO){
        BookEntity BEnt = new BookEntity();
        BEnt.setAuthorEmail(bookDTO.getAuthorEmail());
        BEnt.setAuthorName(bookDTO.getAuthorName());
        BEnt.setAvailableQty(bookDTO.getAvailableQty());
        BEnt.setBookID(bookDTO.getBookID());
        BEnt.setDescription(bookDTO.getDescription());
        BEnt.setName(bookDTO.getName());
        BEnt.setPricePerQty(bookDTO.getPricePerQty());
        return BEnt;
    }
    public static BookDTO conv_Entity_to_DTO(BookEntity bookEntity){
        BookDTO BDTO = new BookDTO();
        BDTO.setAuthorEmail(bookEntity.getAuthorEmail());
        BDTO.setAuthorName(bookEntity.getAuthorName());
        BDTO.setAvailableQty(bookEntity.getAvailableQty());
        BDTO.setBookID(bookEntity.getBookID());
        BDTO.setDescription(bookEntity.getDescription());
        BDTO.setName(bookEntity.getName());
        BDTO.setPricePerQty(bookEntity.getPricePerQty());
        return BDTO;
    }
}
