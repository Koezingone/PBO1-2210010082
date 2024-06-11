package pertemuan2;

public class ShowroomPitstop {
    public static void main(String[] args) {
        // objek pertama
        Showroom1 showroom1 = new Showroom1();
        showroom1.nama = "Ilham";
        showroom1.merek = "Porsche";
        showroom1.model = "911 GT3 RS";
        showroom1.harga = 500000;

        // menampilkan informasi objek pertama
        System.out.println("Informasi Mobil 1 : ");
        System.out.println("Nama Pemesan : " + showroom1.nama);
        System.out.println("Merek Mobil : " + showroom1.merek);
        System.out.println("Model Mobil : " + showroom1.model);
        System.out.println("Harga Mobil : " + showroom1.harga);
        System.out.println();

        // objek kedua
        Showroom1 showroom2 = new Showroom1();
        showroom2.nama = "Marsha";
        showroom2.merek = "BMW";
        showroom2.model = "M4";
        showroom2.harga = 200000;

        // menampilkan informasi objek kedua
        System.out.println("Informasi Mobil 2 : ");
        System.out.println("Nama Pemesan : " + showroom2.nama);
        System.out.println("Merek Mobil : " + showroom2.merek);
        System.out.println("Model Mobil : " + showroom2.model);
        System.out.println("Harga Mobil : " + showroom2.harga);
    }
}
