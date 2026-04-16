package tugas_pbo.tugas4;

public class Menu {
    private String nama;
    private double harga;

    // Constructor
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method default
    public double hitungTotal() {
        return harga;
    }

    public void tampilkan() {
        System.out.println("Menu: " + nama);
        System.out.println("Harga: " + harga);
    }
}