package com.example.bookmanagement.service;

import com.example.bookmanagement.model.Book;
import com.example.bookmanagement.model.Borrower;

import java.util.List;

public interface IBookService {
    List<Book> findAllBook();

    boolean borrowerBook(Borrower borrower);

    boolean returnBook(String code);
}
