import java.util.Scanner;  // Untuk membaca input dari pengguna

//class ParkingTicketMachine
public class ParkingTicketMachine {
    // Atribut
    private int balance;       // Jumlah uang yang dimasukkan
    private int ticketPrice;   // Harga tiket per jam
    private int ticketTime;    // Jumlah waktu parkir yang dibeli (dalam jam)

    // Konstruktor untuk menginisialisasi harga tiket per jam
    public ParkingTicketMachine(int ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.balance = 0;
        this.ticketTime = 0;
    }

    // Metode untuk menambahkan uang yang dimasukkan pengguna
    public void insertMoney(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Uang sebesar Rp" + amount + " telah ditambahkan. Total saldo: Rp" + this.balance);
        } else {
            System.out.println("Masukkan jumlah uang yang valid.");
        }
    }

    // Metode untuk mengeluarkan tiket berdasarkan uang yang dimasukkan
    public void issueTicket() {
        if (balance >= ticketPrice) {
            // Menghitung waktu parkir yang bisa dibeli berdasarkan saldo
            ticketTime = balance / ticketPrice;
            balance -= ticketTime * ticketPrice; // Mengurangi saldo dengan total harga tiket yang dikeluarkan
            System.out.println("Tiket dikeluarkan untuk " + ticketTime + " jam parkir.");
            System.out.println("Sisa saldo: Rp" + balance);
        } else {
            System.out.println("Saldo tidak cukup untuk membeli tiket. Tambahkan lebih banyak uang.");
        }
    }

    // Metode untuk mengembalikan jumlah jam parkir yang dibeli
    public int getTimePurchased() {
        return ticketTime;
    }

    // Metode untuk mendapatkan saldo saat ini
    public int getBalance() {
        return balance;
    }
}