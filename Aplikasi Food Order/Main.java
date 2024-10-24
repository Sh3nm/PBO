import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static FoodOrder order = new FoodOrder();
    private static ArrayList<MenuItem> availableMenu = new ArrayList<>();

    public static void main(String[] args) {
        initializeMenu();
        boolean isRunning = true;
        
        while (isRunning) {
            displayMainMenu();
            int choice = getIntInput("Pilih menu (1-5): ");
            
            switch (choice) {
                case 1:
                    tambahPesanan();
                    break;
                case 2:
                    hapusPesanan();
                    break;
                case 3:
                    order.displayOrder();
                    break;
                case 4:
                    prosesPembayaran();
                    break;
                case 5:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }

    private static void initializeMenu() {
        // Makanan
        availableMenu.add(new MenuItem("Nasi Goreng Spesial", 25000, "Nasi goreng dengan telur dan ayam"));
        availableMenu.add(new MenuItem("Mie Goreng", 23000, "Mie goreng dengan sayuran"));
        availableMenu.add(new MenuItem("Ayam Bakar", 30000, "Ayam bakar dengan sambal"));
        availableMenu.add(new MenuItem("Sate Ayam", 20000, "10 tusuk sate ayam"));
        availableMenu.add(new MenuItem("Gado-gado", 15000, "Sayuran dengan bumbu kacang"));
        
        // Minuman
        availableMenu.add(new MenuItem("Es Teh", 5000, "Teh manis dingin"));
        availableMenu.add(new MenuItem("Es Jeruk", 7000, "Jeruk peras dingin"));
        availableMenu.add(new MenuItem("Es Campur", 12000, "Es campur dengan berbagai isian"));
        availableMenu.add(new MenuItem("Jus Alpukat", 10000, "Jus alpukat segar"));
        availableMenu.add(new MenuItem("Air Mineral", 3000, "Air mineral dalam kemasan"));
    }

    private static void displayMainMenu() {
        System.out.println("\n=== APLIKASI FOOD ORDER ===");
        System.out.println("1. Tambah Pesanan");
        System.out.println("2. Hapus Pesanan");
        System.out.println("3. Lihat Pesanan");
        System.out.println("4. Proses Pembayaran");
        System.out.println("5. Keluar");
    }

    private static void displayAvailableMenu() {
        System.out.println("\n=== DAFTAR MENU ===");
        System.out.println("=== MAKANAN ===");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + availableMenu.get(i).toString());
        }
        System.out.println("\n=== MINUMAN ===");
        for (int i = 5; i < availableMenu.size(); i++) {
            System.out.println((i+1) + ". " + availableMenu.get(i).toString());
        }
        System.out.println("================");
    }

    private static void tambahPesanan() {
        displayAvailableMenu();
        int menuChoice = getIntInput("Pilih nomor menu (1-" + availableMenu.size() + "): ");
        
        if (menuChoice >= 1 && menuChoice <= availableMenu.size()) {
            MenuItem selectedItem = availableMenu.get(menuChoice - 1);
            order.addMenuItem(selectedItem);
            System.out.println("Pesanan " + selectedItem.getName() + " berhasil ditambahkan!");
        } else {
            System.out.println("Nomor menu tidak valid!");
        }
    }

    private static void hapusPesanan() {
        if (order.getMenuItems().isEmpty()) {
            System.out.println("Belum ada pesanan yang bisa dihapus!");
            return;
        }

        order.displayOrder();
        int index = getIntInput("Masukkan nomor pesanan yang akan dihapus: ") - 1;
        
        if (index >= 0 && index < order.getMenuItems().size()) {
            order.removeMenuItem(index);
            System.out.println("Pesanan berhasil dihapus!");
        } else {
            System.out.println("Nomor pesanan tidak valid!");
        }
    }

    private static void prosesPembayaran() {
        if (order.getMenuItems().isEmpty()) {
            System.out.println("Tidak ada pesanan yang bisa dibayar!");
            return;
        }

        if (order.isPaid()) {
            System.out.println("Pesanan sudah dibayar sebelumnya!");
            return;
        }

        order.displayOrder();
        System.out.println("Total yang harus dibayar: Rp" + order.getTotalPrice());
        
        double payment = getDoubleInput("Masukkan jumlah pembayaran: ");
        
        if (payment >= order.getTotalPrice()) {
            order.setPaid(true);
            double change = payment - order.getTotalPrice();
            System.out.println("Pembayaran berhasil!");
            System.out.println("Kembalian: Rp" + change);
        } else {
            System.out.println("Pembayaran gagal! Jumlah pembayaran kurang!");
        }
    }

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Mohon masukkan angka yang valid!");
            }
        }
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Mohon masukkan angka yang valid!");
            }
        }
    }
}