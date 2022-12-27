package case_study_furama_resort_part_two.services;

import case_study_furama_resort_part_two.models.person.Customer;

public interface ICustomerService extends IService{
    void editCustomer(int customerID,int choice, String newElementValue);

    void addElement(Customer customer);
}
