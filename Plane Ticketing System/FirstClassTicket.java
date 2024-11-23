
public class FirstClassTicket extends Ticket {
    
    public FirstClassTicket(String penumpang, double hargaDasar){
        super(penumpang, hargaDasar);
    }

    @Override
    public double calculateFare(){
        return hargaDasar * 1.5; // Tambahan 50%
    }

    @Override
    public void displayInfo(){
        System.out.println("=== Tiket First Class ===");
        super.displayInfo();
        System.out.println("Biaya tambahan 50% telah diterapkan.");
    }
}
