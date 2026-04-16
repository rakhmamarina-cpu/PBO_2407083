package tugas_pbo.tugas4;

public class MenuItem extends Menu{
    private int jumlah;

    // Constructor
    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    // Getter & Setter
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Override
    @Override
    public double hitungTotal() {
        return getHarga() * jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.println("Menu: " + getNama());
        System.out.println("Harga: " + getHarga());
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total: " + hitungTotal());
    }
}