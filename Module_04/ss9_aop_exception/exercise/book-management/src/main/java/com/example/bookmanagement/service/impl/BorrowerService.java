package com.example.bookmanagement.service.impl;

import com.example.bookmanagement.model.Borrower;
import com.example.bookmanagement.repository.IBorrowerRepository;
import com.example.bookmanagement.service.IBorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerService implements IBorrowerService {
    @Autowired
    IBorrowerRepository borrowerRepository;
    @Override
    public List<Borrower> findAllBorrower() {
        return borrowerRepository.findAll();
    }

    @Override
    public String setCodeBorrower() {
        return String.format("%05d", (int) (Math.random() * 100000));
    }
}
