package tugas_pbo.tugas4;

public class Main {
    public static void main(String[] args) {

        Menu m1 = new MenuItem("Ayam Goreng", 10000, 2);
        Menu m2 = new MenuItem("Nasi Goreng", 15000, 1);
        Menu m3 = new MenuItem("Es Teh", 5000, 3);

        double totalSemua = 0;

        System.out.println("===== STRUK PEMBELIAN =====");

        m1.tampilkan();
        m2.tampilkan();
        m3.tampilkan();

        totalSemua += m1.hitungTotal();
        totalSemua += m2.hitungTotal();
        totalSemua += m3.hitungTotal();

        System.out.println("TOTAL SEMUA: " + totalSemua);
        System.out.println("===========================");
    }
}