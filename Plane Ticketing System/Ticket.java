public class Ticket {
    protected String penumpang;
    protected double hargaDasar;

    public Ticket(String penumpang, double hargaDasar){
        this.penumpang = penumpang;
        this.hargaDasar = hargaDasar;
    }

    public double calculateFare(){
        return hargaDasar;
    }

    public void displayInfo(){
        System.out.println("Penumpang: " + penumpang);
        System.out.println("Harga Dasar: Rp " + hargaDasar);
        System.out.println("Tarif Akhir: Rp " + calculateFare());
    }
}

