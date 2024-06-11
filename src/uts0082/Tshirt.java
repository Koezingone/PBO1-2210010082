
package uts0082;


public class Tshirt extends Merchandise {
    private String size;
    
    //konstruktor
    public Tshirt(String name, double price, String size){
        super(name, price);
        this.size = size;
    }
    
    //accessor
    public String getSize() {
        return size;
    }
    
    //mutator
    public void setSize(String size) {
        this.size = size;
        
    }
    
   @Override
   public void displayInfo() {
        System.out.println("Kaos : " + getName() + ", Harga : $" + getPrice() + ", Ukuran : " + size);
    }
}
