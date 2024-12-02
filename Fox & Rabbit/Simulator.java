import java.util.ArrayList;
import java.util.List;

public class Simulator {
    private Field field;
    private List<Animal> animals;
    public Simulator(int depth, int width) {
        field = new Field(depth, width);
        animals = new ArrayList<>();
        populate();
    }

    public void simulate(int steps) {
        for (int step = 0; step < steps; step++) {
            System.out.println("Step " + step);  // Menampilkan langkah simulasi
            List<Animal> newAnimals = new ArrayList<>();
            for (Animal animal : animals) {
                animal.act(newAnimals);
            }
            animals.addAll(newAnimals);
    
            // Tambahkan juga output untuk melihat keadaan hewan setelah setiap langkah
            System.out.println("Jumlah hewan saat ini: " + animals.size());
        }
    }
    

    private void populate() {
        int numberOfFoxes = 5;
        int numberOfRabbits = 10;
    
        // Tambahkan foxes ke field
        for (int i = 0; i < numberOfFoxes; i++) {
            Location location = getRandomLocation();
            Fox fox = new Fox(field, location);
            animals.add(fox);
            field.place(fox, location);
        }
    
        // Tambahkan rabbits ke field
        for (int i = 0; i < numberOfRabbits; i++) {
            Location location = getRandomLocation();
            Rabbit rabbit = new Rabbit(field, location);
            animals.add(rabbit);
            field.place(rabbit, location);
        }
    
        // Cetak jumlah hewan yang ditambahkan
        System.out.println("Jumlah foxes: " + numberOfFoxes);
        System.out.println("Jumlah rabbits: " + numberOfRabbits);
    }
    
    
    private Location getRandomLocation() {
        // Menghasilkan lokasi acak di dalam medan
        int row = (int) (Math.random() * field.getDepth());
        int col = (int) (Math.random() * field.getWidth());
        Location location = new Location(row, col);
        
        // Pastikan lokasi ini kosong
        while (field.getObjectAt(location) != null) {
            row = (int) (Math.random() * field.getDepth());
            col = (int) (Math.random() * field.getWidth());
            location = new Location(row, col);
        }
        
        return location;
    }
}