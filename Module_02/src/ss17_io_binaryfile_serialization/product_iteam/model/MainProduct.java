package ss17_io_binaryfile_serialization.product_iteam.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProduct {
    private static final String PATH_FILE = "src/ss17_io_binaryfile_serialization/product_iteam/model/List_Iteam.csv";
    private static List<Product> iteamList = new ArrayList<>();

    public static void main(String[] args) {
        addProduct(new Product(1, "Apple", "Australia","2022", 60));
        addProduct(new Product(2, "Banana", "Canada","2020", 100));
        addProduct(new Product(3, "Orange", "USA","2020", 120));
        addProduct(new Product(4, "Nep Moi Alcohol", "Viet Nam","2022", 999));
        System.out.println("Show all item in product:\n"+display());
        findProduct();
    }
    private static List<Product> display() {
        List<Product> iteamList = new ArrayList<>();
        try {
            FileInputStream fileInputStream= new FileInputStream(PATH_FILE);;
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);;
            MainProduct.iteamList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return MainProduct.iteamList;
    }

    private static void addProduct(Product product) {
        try {
            iteamList.add(product);
            FileOutputStream fileOutputStream = new FileOutputStream(PATH_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(iteamList);
            fileOutputStream.close();
            objectOutputStream.close();
            System.out.println("Added Sucessfull.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void findProduct(){
        System.out.println("Enter id you want find: ");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product: iteamList) {
            if(id == product.getId()){
                System.out.println("Result: \n"+product);
                return;
            }
        }
        System.out.println("Not found item in database.");
    }

}