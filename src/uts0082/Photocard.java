
package uts0082;


public class Photocard extends Merchandise {
    private String member;
    
    //konstruktor
    public Photocard(String name, double price, String member){
        super(name, price);
        this.member = member;
    }
    //accessor
    public String getMember() {
        return member;
    }
    
    //mutator
    public void setMember(String member) {
        this.member = member;
    }  
    @Override
   public void displayInfo() {
        System.out.println("Photocard : " + getName() + ", Harga : $" + getPrice() + ", Member : " + member);
    }  
}
