package org.com;

public abstract class Product {
    private String name;
    private double price;
    private double rating;
    private int id;

    public Product(int id, String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.id = id;
    }
    public Product(int id, String name, double price) {
        this.name = name;
        this.price = price;
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
