package tugas_pbo.tugas2;

public class Main {
    public static void main(String[] args) {
        // data sesuai soal
        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        // objek
        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);

        // output
        System.out.println("Luas Alas = " + br.hitungLuas());
        System.out.println("Volume = " + br.hitungVolume());
    }
}