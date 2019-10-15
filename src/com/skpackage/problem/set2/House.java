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
        setPrice(price);
        owner = new Person(name);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {

        validPrice(price);
        System.out.println("Price is now " + price);
        //this.price = price;
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

    public void validPrice(double price) {

        System.out.println("Price is now " + price);
        if (price < Double.MAX_VALUE && price>=0)
            this.price = price;

        System.out.println("Argument price is now " + price);
        System.out.println("Attribute price is now " + this.price);
        //else
        //    price = this.price;

       // return this.price;
    }

    public String toString() {
        return String.format("Address: %s\nType: %s\nPrice: %.2f\nOwner: %s", address, type, price, owner);

    }
}
