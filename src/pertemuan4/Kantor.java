
package pertemuan4;


public class Kantor {
    public static void main(String[] args) {
        Orang orang = new Orang("Khairul Ilham", 19);
        orang.tampilkaninfo();
        
        System.out.println();
        
        Pekerja pekerja = new Pekerja("Marsha Lenathea", 17, "J48KT9");
        pekerja.tampilkanInfo();
        
        System.out.println();
        Manager manager = new Manager("Gita Sekar", 22, "J48KT6", "Manager");
        manager.tampilkanInfo();
    }
}
