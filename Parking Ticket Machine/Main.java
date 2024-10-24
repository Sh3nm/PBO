import java.util.Scanner;  // Untuk membaca input dari pengguna

public class Main {
    public static void main(String[] args) {
        // Membuat objek mesin tiket dengan harga Rp5.000 per jam
        ParkingTicketMachine machine = new ParkingTicketMachine(5000);
        Scanner scanner = new Scanner(System.in);  // Membaca input dari pengguna
        boolean continueTransaction = true;  // Variabel untuk menghentikan transaksi

        System.out.println("Selamat datang di Mesin Tiket Parkir!");
        while (continueTransaction) {
            System.out.println("1. Masukkan Uang");
            System.out.println("2. Cetak Tiket");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah uang (Rp): ");
                    int amount = scanner.nextInt();
                    machine.insertMoney(amount);
                    break;
                case 2:
                    machine.issueTicket();
                    break;
                case 3:
                    continueTransaction = false;
                    System.out.println("Terima kasih telah menggunakan mesin tiket parkir.");
                    break;
                default:
                    System.out.println("Opsi tidak valid, silakan coba lagi.");
            }
        }
        scanner.close();  
    }
}
