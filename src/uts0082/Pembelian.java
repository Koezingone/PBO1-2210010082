
package uts0082;


public class Pembelian {
    public static void main(String[] args) {
        //membuat objek TShirt dan Photocard
        Tshirt tshirt = new Tshirt("Jiwaru days TShirt",19.99, "Xl");
        Photocard photocard = new Photocard("Photocard Spring has come", 4.99,"marsha Lenathea");
        
        //menampilkan informasi
        tshirt.displayInfo();
        photocard.displayInfo();
    }
}
