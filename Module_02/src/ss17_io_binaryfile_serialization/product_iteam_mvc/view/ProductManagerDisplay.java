package ss17_io_binaryfile_serialization.product_iteam_mvc.view;

import ss17_io_binaryfile_serialization.product_iteam_mvc.controller.ProductController;
import ss17_io_binaryfile_serialization.product_iteam_mvc.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductManagerDisplay {
    private final Scanner scanner = new Scanner(System.in);
    private final ProductController productController = new ProductController();

    public void menuManagementProduct() {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Chào mừng bạn đến với danh sách quản lý sản phẩm");
            System.out.println("1. Thêm mới sản phẩm.");
            System.out.println("2. Hiện thị sản phẩm");
            System.out.println("3. Tìm kiếm ");
            System.out.println("4. Exit");
            System.out.print("Mời bạn nhập chức năng  ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Mời bạn nhập ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Mời bạn nhập tên: ");
                    String name = scanner.nextLine();

                    System.out.print("Mời bạn nhập hãng: ");
                    String manufacture = scanner.nextLine();

                    System.out.print("Mời bạn nhập giá: ");
                    double price = Integer.parseInt(scanner.nextLine());

                    System.out.print("Mời bạn nhập mô tả: ");
                    String otherDescriptions = scanner.nextLine();

                    Product product = new Product(id, name, manufacture, price,otherDescriptions);
                    this.productController.add(product);
                    break;
                case 2:
                    List<Product> arrProduct = this.productController.getAllProduct();
                    for (Product p: arrProduct) {
                        System.out.println(p.toString());
                    }
                    break;
                case 3:
                    System.out.print("Nhập id bạn muốn tìm: ");
                    int idFind = Integer.parseInt(scanner.nextLine());

                    boolean checkProduct = this.productController.findProductInfo(idFind);
                    if (checkProduct) {
                        for (Product p: this.productController.getAllProduct()) {
                            if (p.getId() == idFind) {
                                System.out.println(p);
                            }
                        }
                    } else {
                        System.out.println("Không tìm thấy vui lòng nhập lại: ");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }
}

