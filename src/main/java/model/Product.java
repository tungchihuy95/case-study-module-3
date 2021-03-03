package model;

import com.sun.org.apache.xpath.internal.operations.String;

public class Product {
    private int productId;
    private int listId;
    private String productName;
    private float listedPrice;
    private float promo;
    private String size;
    private String color;
    private String material;
    private String shortDesc;

    public Product() {
    }

    public Product(int productId, int listId, String productName, float listedPrice, float promo, String size, String color, String material, String shortDesc) {
        this.productId = productId;
        this.listId = listId;
        this.productName = productName;
        this.listedPrice = listedPrice;
        this.promo = promo;
        this.size = size;
        this.color = color;
        this.material = material;
        this.shortDesc = shortDesc;
    }
}
