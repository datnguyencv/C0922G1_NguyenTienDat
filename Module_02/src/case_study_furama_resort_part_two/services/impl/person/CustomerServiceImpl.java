package case_study_furama_resort_part_two.services.impl.person;

import case_study_furama_resort_part_two.libs.read_and_write_file_customer.ReadFileCustomer;
import case_study_furama_resort_part_two.libs.read_and_write_file_customer.WriteFileCustomer;
import case_study_furama_resort_part_two.models.person.Customer;
import case_study_furama_resort_part_two.services.ICustomerService;

import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private static LinkedList<Customer> customerLinkedList = new LinkedList<>();
    private final String CUSTOMER_PATH_NAME = "src/case_study_furama_resort_part_two/datas/customer.csv";

    @Override
    public void editCustomer(int customerEditedID, int choice, String newElementValue) {
        customerLinkedList = ReadFileCustomer.readFile(CUSTOMER_PATH_NAME);

        if (customerLinkedList.isEmpty()){
            System.out.println("Nothing in the list");
            return;
        }

        if (!customerExisted(customerEditedID)){
            System.out.println("Not existed");
            return;
        }

        switch (choice) {
            case 1:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setName(newElementValue);
                        break;
                    }
                }
                break;
            case 2:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setDateOfBirth(newElementValue);
                        break;
                    }
                }
                break;
            case 3:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setGender(newElementValue);
                        break;
                    }
                }
                break;
            case 4:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setIdentification(newElementValue);
                        break;
                    }
                }
                break;
            case 5:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setPhoneNumber(newElementValue);
                        break;
                    }
                }
                break;
            case 6:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setEmail(newElementValue);
                        break;
                    }
                }
                break;
            case 7:
                for (Customer customer : customerLinkedList) {
                    if (customer.getCustomerID() == customerEditedID) {
                        customer.setCustomerType(newElementValue);
                        break;
                    }
                }
                break;
            default:
                break;
        }
        WriteFileCustomer.writeFile(CUSTOMER_PATH_NAME,customerLinkedList);
        System.out.println("successfully edited");
    }

    public boolean customerExisted(int customerID) {
        customerLinkedList = ReadFileCustomer.readFile(CUSTOMER_PATH_NAME);
        for (Customer customer : customerLinkedList) {
            if (customer.getCustomerID() == customerID) {
                return true;
            }
        }
        return false;

    }


    @Override
    public List<Customer> getList() {
        customerLinkedList = ReadFileCustomer.readFile(CUSTOMER_PATH_NAME);
        return customerLinkedList;
    }

    @Override
    public void addElement(Customer customer) {
        customerLinkedList = ReadFileCustomer.readFile(CUSTOMER_PATH_NAME);

        for (Customer cus : customerLinkedList) {
            if (cus.getCustomerID() == customer.getCustomerID()) {
                System.out.println("Already existed");
                return;
            }
        }
        customerLinkedList.add(customer);
        WriteFileCustomer.writeFile(CUSTOMER_PATH_NAME,customerLinkedList);
        System.out.println("Successful added!");
    }

}
