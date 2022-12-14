package ss12_java_collection_framework.service;

import ss12_java_collection_framework.model.Product;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

public class ProductService implements IProductService {
    private static final List<Product> arrProduct = new LinkedList<>();

    static {
        arrProduct.add(new Product("1000", 2000, "VietNam", 10));
        arrProduct.add(new Product("2000", 2010, "VietNam", 60));
        arrProduct.add(new Product("6000", 2020, "Trung Quốc", 30));
        arrProduct.add(new Product("3000", 2022, "Hoa Kỳ", 20));
    }

    Scanner scanner = new Scanner(System.in);

    /*
     * thêm mới một sản phẩm
     */
    public void add() {
        Product product = infoProduct();
        String productID = product.getId();
        if (check(productID, product)) {
            System.out.print("ID bạn thêm mới bị trùng -> kiểm tra lại : ");
        } else {
            arrProduct.add(product);
            System.out.println("Thêm sản phẩm thành công");
        }
    }

    /*
     * xoá một sản phẩm theo ID
     */
    public void remove() {
        Product productGetI = this.inputID("Mời bạn nhập vào ID cần xóa: ");
        if (productGetI == null) {
            System.out.println("Không tìm thấy đối tượng cần xóa");
        } else {
            System.out.println("Bạn có chắc muốn xóa đối tượng có ID là " + productGetI.getId() + " không?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                arrProduct.remove(productGetI);
                System.out.println("Xóa thành công!");
            }
        }
    }

    /*
     * hiển thị all product
     */
    public void display() {
        for (Product x : arrProduct) {
            System.out.println(x.toString());
        }
    }

    /*
     * tìm kiếm sản phẩm theo ID
     */
    public void search() {
        Product productGetI = inputID("Nhập ID cần tìm kiếm");
        if (productGetI == null) {
            System.out.println("Không tìm thấy đối tượng cần update");
        } else {
            System.out.println(productGetI);
        }
    }

    /*
     * update một sản phẩm theo ID
     */
    public void update() {
        Product productGetI = inputID("Mời bạn nhập id cần tìm: ");
        if (productGetI != null) {
            Product productUpdate = this.updateInfoProduct(productGetI.getId());
            int index = arrProduct.indexOf(productGetI);
            System.out.println("Bạn có chắc muốn update đối tượng có ID là " + productUpdate.getId() + " không?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                arrProduct.set(index, productUpdate);
                System.out.println("Update thành công!");
            }
        } else {
            System.out.println("Không tìm thấy đối tượng cần update");
        }
    }

    /*
     * sắp xếp product theo chiều tăng dần
     */
    public void sortRaiseProductPrice() {
        for (int i = 0; i < arrProduct.size() - 1; i++) {
            for (int j = i + 1; j < arrProduct.size(); j++) {
                if (arrProduct.get(j).getPrice() < arrProduct.get(i).getPrice()) {
                    Product temp = arrProduct.get(i);
                    arrProduct.set(i, arrProduct.get(j));
                    arrProduct.set(j, temp);
                }
            }
        }
        for (Product x : arrProduct) {
            System.out.println(x.toString());
        }
    }

    /*
     * sắp xếp product theo chiều giảm dần
     */
    public void sortReduceProductPrice() {
        for (int i = 0; i < arrProduct.size() - 1; i++) {
            for (int j = i + 1; j < arrProduct.size(); j++) {
                if (arrProduct.get(j).getPrice() > arrProduct.get(i).getPrice()) {
                    Product temp = arrProduct.get(i);
                    arrProduct.set(i, arrProduct.get(j));
                    arrProduct.set(j, temp);
                }
            }
        }
        for (Product x : arrProduct) {
            System.out.println(x.toString());
        }
    }

    /*
     * cập nhật thông tin sản phẩm mới
     *
     * trả về sản phâm có thông tin mới or (null)
     */
    public Product updateInfoProduct(String id) {
        for (int i = 0; i < arrProduct.size(); i++) {
            if (arrProduct.get(i).getId().equals(id)) {
                System.out.print("Mời bạn nhập Năm sản xuất: ");
                int yearManufacture = Integer.parseInt(scanner.nextLine());
                System.out.print("Mời bạn nhập nơi sản xuất: ");
                String made = scanner.nextLine();
                System.out.print("Mời bạn nhập giá: ");
                double price = Integer.parseInt(scanner.nextLine());
                return new Product(id, yearManufacture, made, price);
            }
        }
        return null;
    }

    /*
     * nhập ID và kiểm tra ID
     *
     * trả về vùng nhớ ở vị trí thứ i or (null)
     */
    public Product inputID(String notification) {
        System.out.print(notification);
        String id = scanner.nextLine();
        for (int i = 0; i < arrProduct.size(); i++) {
            if (arrProduct.get(i).getId().equals(id)) {
                return arrProduct.get(i);
            }
        }
        return null;
    }

    /*
     * kiểm tra id nhập vào dã có chưa
     * có or không
     */
    public boolean check(String valueinput, Product valuecheck) {
        for (int i = 0; i < arrProduct.size(); i++) {
            if (arrProduct.get(i).getId().equals(valueinput)) {
                return true;
            }
        }
        return false;
    }

    /*
     * Nhập thông tin cho một sản phẩm mới
     */
    public Product infoProduct() {
        System.out.print("Mời bạn nhập ID: ");
        String id = scanner.nextLine();

        System.out.print("Mời bạn nhập Năm sản xuất: ");
        int yearManufacture = Integer.parseInt(scanner.nextLine());

        System.out.print("Mời bạn nhập nơi sản xuất: ");
        String made = scanner.nextLine();

        System.out.print("Mời bạn nhập giá: ");
        double price = Integer.parseInt(scanner.nextLine());
        return new Product(id, yearManufacture, made, price);
    }
}
