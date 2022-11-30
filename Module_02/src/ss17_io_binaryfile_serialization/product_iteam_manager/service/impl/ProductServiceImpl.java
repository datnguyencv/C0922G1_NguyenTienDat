package ss17_io_binaryfile_serialization.product_iteam_manager.service.impl;

import ss17_io_binaryfile_serialization.product_iteam_manager.model.Product;
import ss17_io_binaryfile_serialization.product_iteam_manager.service.IProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {

    public static final String PATH_FILE =
            "src/ss17_io_binaryfile_serialization/product_iteam_manager/repository/product.csv";

    public static List<Product> arrProduct = new ArrayList<>();
    @Override
    public void addProduct(Product product) {
        for (Product p : arrProduct) {
            if (p.getId() == product.getId()) {
                System.out.println("Id bạn nhập đã có");
                return;
            }
        }
        arrProduct.add(product);

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(PATH_FILE);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(arrProduct);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream(PATH_FILE);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return productList;
    }

    @Override
    public boolean findProductInfo(int id) {
        List<Product> arrProduct = getAllProduct();
        for (Product p : arrProduct) {
            if (id == p.getId()) {
                return true;
            }
        }
        return false;
    }
}
