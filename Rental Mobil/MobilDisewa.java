public class MobilDisewa extends Mobil {
    String penyewa;

    public MobilDisewa(String nama, String tipe, String penyewa) {
        super(nama, tipe);
        this.penyewa = penyewa;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Penyewa: " + penyewa);
    }
}
