
package pertemuan4;


public class Pekerja extends Orang {
    private String idKaryawan;
    
    public Pekerja (String nama, int umur, String idKaryawan) {
        super(nama, umur);
        this.idKaryawan = idKaryawan;
    }
    
    public String getidKaryawan(){
        return idKaryawan;
    }
    
    public void setidKaryawan(String idKaryawan){
        this.idKaryawan = idKaryawan;
    }
    
    public void tampilkanInfo(){
        super.tampilkaninfo();
        System.out.println("ID Karyawan : " + idKaryawan);
    }
}
