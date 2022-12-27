package case_study_furama_resort_part_two.controllers;

import case_study_furama_resort_part_two.services.impl.person.CustomerServiceImpl;
import case_study_furama_resort_part_two.models.person.Customer;

import java.util.List;

public class CustomerController {
    private CustomerServiceImpl customerService = new CustomerServiceImpl();

    public List<Customer> getCustomerList() {
        return this.customerService.getList();
    }

    public void addCustomer(Customer customer) {
        this.customerService.addElement(customer);
    }

    public boolean customerExisted(int customerEditedID) {
        return this.customerService.customerExisted(customerEditedID);
    }

    public void editCustomer(int customerEditedID, int editedChoice, String newElementValue) {
        this.customerService.editCustomer(customerEditedID,editedChoice,newElementValue);
    }
}
