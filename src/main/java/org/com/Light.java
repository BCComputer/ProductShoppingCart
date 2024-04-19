package org.com;

public class Light extends Product {
    private int watts;    // Power consumption in watts
    private int lumens;   // Brightness in lumens

    public Light(int id, String name, double price, double rating, int watts, int lumens) {
        super(id, name,price, rating);
        this.watts = watts;
        this.lumens = lumens;
    }

    @Override
    public String toString() {
        return  "Id: " + super.getId() +
                " Name: "+ super.getName() +
                " Price: " + super.getPrice() +
                " Wats: " + watts +
                " Lumens: "+ lumens +"\n";
    }

}
