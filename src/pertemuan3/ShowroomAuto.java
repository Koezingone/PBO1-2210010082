
package pertemuan3;

public class ShowroomAuto {
    public static void main(String[] args) {
        showroom2 showroomporsche = new showroom2("ilham","porsche", "911 GT3 RS", 500000 );
        
        System.out.println("Informasi Mobil 1 : ");
        System.out.println("nama Pemesan : " + showroomporsche.getNama());
        System.out.println("Merek Mobil : " + showroomporsche.getMerek());
        System.out.println("Model Mobil : " + showroomporsche.getModel());
        System.out.println("Harga Mobil : " + showroomporsche.getHarga());
        System.out.println();
        
        showroom2 showroombmw = new showroom2("marsha","bmw", "M4", 300000 );
        
        System.out.println("Informasi Mobil 1 : ");
        System.out.println("nama Pemesan : " + showroombmw.getNama());
        System.out.println("Merek Mobil : " + showroombmw.getMerek());
        System.out.println("Model Mobil : " + showroombmw.getModel());
        System.out.println("Harga Mobil : " + showroombmw.getHarga());
        System.out.println();
    }
    
}
