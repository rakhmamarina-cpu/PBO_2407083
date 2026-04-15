package tugas_pbo.tugas2;

public class BangunDatar {
    // enkapsulasi
    private double panjang;
    private double lebar;

    // constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // getter
    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double hitungLuas() {
        return panjang * lebar * 2;
    }
}