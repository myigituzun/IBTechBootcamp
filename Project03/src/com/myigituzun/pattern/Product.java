package com.myigituzun.pattern;

public class Product {
    private long productId;
    private String productName;
    private double salePrice;

    public Product(long productId, String productName, double salePrice) {
        this.productId = productId;
        this.productName = productName;
        this.salePrice = salePrice;
    }

    public Product() {
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

}
