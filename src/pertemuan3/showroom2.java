
package pertemuan3;


public class showroom2 {
    //atribut
    private String nama, merek, model;
    private int harga;
    
    //konstruktor
    public showroom2() {
        
    }
    
    public showroom2(String nama, String merek, String model, int harga) {
        this.nama = nama;
        this.merek = merek;
        this.model = model;
        this.harga = harga;
    }
    
     //mutator
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setMerek(String merek){
        this.merek = merek;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    //accessor
    public String getNama(){
        return nama;
    }
    public String getMerek(){
        return merek;
    }
    public String getModel(){
        return model;
    }
    public int getHarga(){
        return harga;
    }
}
