package ss17_io_binaryfile_serialization.product_iteam_manager;

import ss17_io_binaryfile_serialization.product_iteam_manager.service.impl.ProductServiceImpl;
import ss17_io_binaryfile_serialization.product_iteam_manager.view.ProductManagerDisplay;

import java.io.*;

public class MainProduct {
    public static final String DATA_LIST_ITEM = "src/ss17_io_binaryfile_serialization/product_iteam_manager/repository/product.csv";
    public static void main(String[] args) {
        ProductManagerDisplay productManagerController = new ProductManagerDisplay();
        productManagerController.menuManagementProduct();
        ProductServiceImpl productService=new ProductServiceImpl();
        writeToFile(DATA_LIST_ITEM,productService.toString());
    }
    public static void writeToFile(String path,String products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
