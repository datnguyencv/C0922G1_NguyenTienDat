package mvc_practice.product_iteam_manager.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manufacture;
    private double price;
    private String otherDescriptions;

    public Product(int id, String name, String manufacture, double price, String otherDescriptions) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
        this.otherDescriptions = otherDescriptions;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOtherDescriptions() {
        return otherDescriptions;
    }

    public void setOtherDescriptions(String otherDescriptions) {
        this.otherDescriptions = otherDescriptions;
    }

//    public String formatCSVForStudent() {
//        return this.id + "," + this.name + "," + this.manufacture + "," + this.price + "," +this.getOtherDescriptions();
//    }
    @Override
    public String toString() {
        return String.format("|%-3s|%-10S|%-10s|%-8.2f|%-20s|", id, name, manufacture, price,otherDescriptions);

    }
}
