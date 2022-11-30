package mvc_practice.product_iteam_manager.service;

import ss17_io_binaryfile_serialization.product_iteam_manager.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    List<Product> getAllProduct();

    boolean findProductInfo(int id);

}

