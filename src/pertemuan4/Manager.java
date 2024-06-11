
package pertemuan4;


public class Manager extends Pekerja {
    private String departemen;
    
    public Manager(String nama, int umur, String idKaryawan, String departemen) {
        super(nama, umur, idKaryawan);
        this.departemen = departemen;
    }
    
    public String getDepartemen(){
        return departemen;
    }
    
    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Departemen : " + departemen);
    }
}
