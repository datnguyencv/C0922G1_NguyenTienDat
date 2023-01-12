package thi_module2.task3.service;

import thi_module2.task3.model.Banking;

public interface IBankingService {

    void add(Banking banking) ;
    void displayList();
    void sort();
    void find(String str);


}
