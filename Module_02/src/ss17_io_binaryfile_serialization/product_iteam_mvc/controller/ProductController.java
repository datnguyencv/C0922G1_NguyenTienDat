package ss17_io_binaryfile_serialization.product_iteam_mvc.controller;

import ss17_io_binaryfile_serialization.product_iteam_mvc.model.Product;
import ss17_io_binaryfile_serialization.product_iteam_mvc.service.IProductService;
import ss17_io_binaryfile_serialization.product_iteam_mvc.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductServiceImpl();

    public void add(Product product){
        this.productService.addProduct(product);
    }

    public List<Product> getAllProduct(){
        return this.productService.getAllProduct();
    }

    public boolean findProductInfo(int id){
        this.productService.findProductInfo(id);
        return true;
    }
}
