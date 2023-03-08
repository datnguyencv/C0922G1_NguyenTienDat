package com.example.bookmanagement.service.impl;

import com.example.bookmanagement.model.Book;
import com.example.bookmanagement.model.Borrower;
import com.example.bookmanagement.repository.IBookRepository;
import com.example.bookmanagement.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {
    @Autowired
    IBookRepository bookRepository;

    @Override
    public List<Book> findAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public boolean borrowerBook(Borrower borrower) {
        Book book = bookRepository.findById(borrower.getBook().getId());
        if (book == null) {
            return false;
        }
        if (book.getQuantity() <= 0)
            return false;
    }

    @Override
    public boolean returnBook(String code) {
        return false;
    }
}
