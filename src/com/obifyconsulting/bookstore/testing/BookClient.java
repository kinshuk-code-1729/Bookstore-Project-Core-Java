package com.obifyconsulting.bookstore.testing;

import com.obifyconsulting.bookstore.controller.BookController;
import com.obifyconsulting.bookstore.dto.BookDTO;

public class BookClient {
    public static void main(String[] args) {
        BookController controller = new BookController();
//        Calling "addBook" functionality
//        addBook(controller);
//        Calling "get book details" functionality
        getBook(controller,156L);
    }
    private static void getBook(BookController controller,Long bookID){
        BookDTO bookDTO = controller.getBook(bookID);
        System.out.println("Following are details for book with ID : "+bookID);
        System.out.println("Book Name : "+bookDTO.getName());
        System.out.println("Book Author : "+bookDTO.getAuthorName());
        System.out.println("Book Price : "+bookDTO.getPricePerQty());
        System.out.println("Book Description : "+bookDTO.getDescription());
    }
    private static void addBook(BookController controller){
        //  We will Create the Book DTO & call the controller and the book method
        BookDTO bookDTO = new BookDTO();
        bookDTO.setBookID(156L);
        bookDTO.setAuthorEmail("andrewstbm@gmail.com");
        bookDTO.setAuthorName("Andrew S Tanenbaum");
        bookDTO.setAvailableQty(17);
        bookDTO.setName("Computer Networks");
        bookDTO.setDescription("This book is the absolute \"bible\" in networking fundamentals.");
        bookDTO.setPricePerQty(27.89);

//      Call Controller add method and hold the return value
        Long bookID = controller.add(bookDTO);
        if(bookID != null){
            System.out.println("Book was successfully created with ID : "+bookID);
        }
        else{
            System.out.println("Some Error Occurred while creating a new Book");
        }

    }
}
