package ss17_io_binaryfile_serialization.product_iteam_mvc.service;

import ss17_io_binaryfile_serialization.product_iteam_mvc.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    List<Product> getAllProduct();

    boolean findProductInfo(int id);

}

