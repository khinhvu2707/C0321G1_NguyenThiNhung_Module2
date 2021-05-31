package _17_IO_BinaryFile_Serialization.bai_tap.quanLiSanPham;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String manufacturer;
    private String price;
    private String note;
    public Product(){

    }

    public Product(int id, String name, String manufacturer, String price, String note) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.note = note;
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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product { " +
                " id = " + id +
                ", name = '" + name + '\'' +
                ", manufacturer = '" + manufacturer + '\'' +
                ", price = '" + price + '\'' +
                ", note = '" + note + '\'' +
                '}';
    }
}

