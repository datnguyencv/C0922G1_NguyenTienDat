package case_study_furama_resort_part_two.libs.read_and_write_file_customer;

import case_study_furama_resort_part_two.models.person.Customer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ReadFileCustomer {
    public static LinkedList<Customer> readFile(String pathName) {
        LinkedList<Customer> list = new LinkedList<>();
        File file = new File(pathName);
        if (!file.exists()) {
            return list;
        }
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            String[] lineArr;
            while ((line = bufferedReader.readLine()) != null) {
                lineArr = line.split(",");
                //String name, String dateOfBirth, String gender, String identification,
                //                    String phoneNumber, String email, int customerID, String customerType
                Customer customer = new Customer(lineArr[0],lineArr[1],lineArr[2],lineArr[3],lineArr[4],lineArr[5],
                        Integer.parseInt(lineArr[6]),lineArr[7]);
                list.add(customer);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }
}
