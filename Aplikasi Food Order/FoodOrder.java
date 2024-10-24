import java.util.ArrayList;

public class FoodOrder {
    private ArrayList<MenuItem> menuItems;
    private double totalPrice;
    private boolean isPaid;

    public FoodOrder() {
        this.menuItems = new ArrayList<>();
        this.totalPrice = 0.0;
        this.isPaid = false;
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
        calculateTotalPrice();
    }

    public void removeMenuItem(int index) {
        if (index >= 0 && index < menuItems.size()) {
            menuItems.remove(index);
            calculateTotalPrice();
        }
    }

    private void calculateTotalPrice() {
        this.totalPrice = 0.0;
        for (MenuItem item : menuItems) {
            this.totalPrice += item.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setPaid(boolean status) {
        this.isPaid = status;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void displayOrder() {
        System.out.println("\n=== Detail Pesanan ===");
        if (menuItems.isEmpty()) {
            System.out.println("Belum ada item yang dipesan");
        } else {
            System.out.println("Items:");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println((i+1) + ". " + item.toString());
            }
            System.out.println("\nTotal: Rp" + totalPrice);
            System.out.println("Status Pembayaran: " + (isPaid ? "Sudah Dibayar" : "Belum Dibayar"));
        }
        System.out.println("====================\n");
    }
}