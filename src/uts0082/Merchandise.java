
package uts0082;

public class Merchandise {
    private String name;
    private double price;
    
    //konstruktor
    public Merchandise(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    //accessor
    public String getName(){
        return name;
    }
    
    //mutator
    public void setName(String name) {
        this.name = name;
    }
    
    //accessor
    public double getPrice(){
        return price;
    }
    
    //mutator
    public void setPrice(double price) {
        this.price = price;
    }
    
    //menampilkan informasi merchanidse (polimorfisme: dapat dioverride
    public void displayInfo() {
        System.out.println("Nama : " + name + ", harga : $" + price);
    }
}
