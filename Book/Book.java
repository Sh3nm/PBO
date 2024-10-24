public class Book {
    // Atribut kelas Book
    String judul;
    String penulis;
    int tahunTerbit;
    String namaPenerbit;
    String kategori;

    // Konstruktor untuk menginisialisasi atribut
    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategori = kategori;
    }

    // Metode untuk mencetak detail buku
    public void printDetails() {
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Tahun Terbit: " + this.tahunTerbit);
        System.out.println("Nama Penerbit: " + this.namaPenerbit);
        System.out.println("Kategori: " + this.kategori);
    }
}
