
package pertemuan4;

public class Orang {
    private String nama;
    private int umur;
    
    public Orang(String nama, int umur) {
            this.nama = nama;
            this.umur = umur;
    }       
    public String getNama() {
        return nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void tampilkaninfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }
}
