package Repository.Customer.impl;

import Repository.Customer.ICustomerRepository;
import model.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRepository implements ICustomerRepository {
    @Override
    public void createCustomer(Customer customer) {
        try {
            PreparedStatement preparedStatement = BaseRepository.getConnection()
                    .prepareStatement("insert into customer (name,dateOfBirth,gender,email,password)");
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getDateOfBirth());
            preparedStatement.setString(3,customer.getGender());
            preparedStatement.setString(4,customer.getEmail());
            preparedStatement.setString(5,customer.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
