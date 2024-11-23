import java.util.ArrayList;

public class RentalMobil {

    public static void main(String[] args) {
        ArrayList<Mobil> daftarMobil = new ArrayList<>();

        daftarMobil.add(new MobilTersedia("Toyota Supra", "GR"));
        daftarMobil.add(new MobilTersedia("Hyundai Ioniq 5", 
        "Long Range Prime"));
        daftarMobil.add(new MobilTersedia("BYD Seal", "AWD"));

        daftarMobil.add(new MobilDisewa("Hyundai Ioniq 5", "Long Range Prime", 
        "Ren"));
        daftarMobil.add(new MobilDisewa("Toyota Supra", "GR", "Po"));

        System.out.println("Daftar Mobil Tersedia:");
        for (Mobil mobil : daftarMobil) {
            if (mobil instanceof MobilTersedia) {
                mobil.tampilkanInfo();
            }
        }

        System.out.println("\nDaftar Mobil Disewa:");
        for (Mobil mobil : daftarMobil) {
            if (mobil instanceof MobilDisewa) {
                mobil.tampilkanInfo();
            }
        }
    }
}
