public class Main {
    public static void main(String[] args) {
        Ticket economyTicket = new EconomyTicket("Agus", 1000000);
        Ticket businessTicket = new BusinessTicket("Ren", 1000000);
        Ticket firstClassTicket = new FirstClassTicket("Po", 1000000);

        System.out.println("=== Sistem Reservasi Tiket Pesawat ===\n");
        economyTicket.displayInfo();
        System.out.println();
        businessTicket.displayInfo();
        System.out.println();
        firstClassTicket.displayInfo();
    }
}
