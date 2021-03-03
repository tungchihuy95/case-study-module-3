package model;

import com.sun.org.apache.xpath.internal.operations.String;

public class Order {
    private int orderId;
    private int userId;
    private String orderDate;
    private String name;
    private String address;
    private String email;
    private String phone;
    private int kindNumber;
    private float totalPrice;

    public Order() {
    }

    public Order(int orderId, int userId, String orderDate, String name, String address, String email, String phone, int kindNumber, float totalPrice) {
        this.orderId = orderId;
        this.userId = userId;
        this.orderDate = orderDate;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.kindNumber = kindNumber;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getKindNumber() {
        return kindNumber;
    }

    public void setKindNumber(int kindNumber) {
        this.kindNumber = kindNumber;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
