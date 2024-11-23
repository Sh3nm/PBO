public class BusinessTicket extends Ticket {
    
    public BusinessTicket(String penumpang, double hargaDasar){
        super(penumpang, hargaDasar);
    }

    @Override
    public double calculateFare(){
        return hargaDasar * 1.25; // Tambahan 25%
    }

    @Override
    public void displayInfo(){
        System.out.println("=== Tiket Kelas Bisnis ===");
        super.displayInfo();
        System.out.println("Biaya tambahan 25% telah diterapkan.");
    }
}
