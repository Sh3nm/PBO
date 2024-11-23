public class Mobil {
    String nama;
    String tipe;
    
    public Mobil(String nama, String tipe) {
        this.nama = nama;
        this.tipe = tipe;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Mobil: " + nama + ", Tipe: " + tipe);
    }
}
