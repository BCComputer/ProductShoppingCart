package org.com;

public class Laptop extends Product {

    int screenSize;
    double ram;
    double ssd;
    double processor;
    public Laptop(int id, String name, double price, double rating, int screenSize, double ram, double ssd, double processor) {
        super(id, name, price, rating);
        this.screenSize = screenSize;
        this.ram = ram;
        this.ssd = ssd;
        this.processor = processor;
    }
    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getSsd() {
        return ssd;
    }

    public void setSsd(double ssd) {
        this.ssd = ssd;
    }

    public double getProcessor() {
        return processor;
    }

    public void setProcessor(double processor) {
        this.processor = processor;
    }
    @Override
    public String toString() {
        return "Id: " + super.getId() +
                "  Price: " + super.getPrice() +
                "  Name: " + super.getName() +
                "  RAM: "+ ram +
                "  SSD: " + ssd +
                "  Processor: " + processor + "\n";
    }
@Override
    public boolean equals(Object obj) {
        Laptop laptop = (Laptop)obj;
        return super.getId() == laptop.getId() && this.ram == laptop.ram && this.ssd == laptop.ssd && laptop.processor == laptop.processor;
    }
}
