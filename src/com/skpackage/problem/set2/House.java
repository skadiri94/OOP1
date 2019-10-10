package com.skpackage.problem.set2;

public class House {

    private String address;
    private String type;
    private double price;
    private Person owner;

    public House() {
        this("No Address Specified", "No Type Specified", 0.0, "No Owner Specified");
    }

    public House(String address, String type, double price, String name) {

        setAddress(address);
        setType(type);
        setPrice(validPrice(price));
        owner = new Person(name);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Person getOwner() {
        return owner;
    }

    public double validPrice(double price) {

        if (price > Double.MIN_VALUE)
            this.price = price;
        else
            price = this.price;

        return price;
    }

    public String toString() {
        return String.format("Address: %s\nType: %s\nPrice: %.2f\nOwner: %s", address, type, price, owner);

    }
}
