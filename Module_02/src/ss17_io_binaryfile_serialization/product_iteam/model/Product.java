package ss17_io_binaryfile_serialization.product_iteam.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String yearManuFacture;
    private String made;
    private double price;

    public Product() {
    }

    public Product(int id, String name, String yearManuFacture, String made, double price) {
        this.id = id;
        this.name = name;
        this.yearManuFacture = yearManuFacture;
        this.made = made;
        this.price = price;
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

    public String getYearManuFacture() {
        return yearManuFacture;
    }

    public void setYearManuFacture(String yearManuFacture) {
        this.yearManuFacture = yearManuFacture;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("|%-3s|%-10s|%-15s|%-4s|%-8.2f $|\n", id, name, yearManuFacture, made, price);
    }
}
