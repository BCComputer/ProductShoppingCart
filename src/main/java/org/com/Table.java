package org.com;

public class Table extends Product {
    private double height;
    private double width;
    private double length;

    public Table(int id, String name, double price, double height, double width, double length) {
        super(id, name, price);
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area(){
        return length*width;
    }
    public double volume(){
        return length*width*height;
    }

    @Override
    public String toString() {
        return  "Id: " + super.getId() +
                " Name: "+ super.getName() +
                " Price: " + super.getPrice() +
                " Height: " + height +
                " Width: "+ width +
                " Length: " + length + "\n";
    }
}
