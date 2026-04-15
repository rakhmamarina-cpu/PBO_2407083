package tugas_pbo.tugas2;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    // constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar); // ambil dari parent
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas(){
        return panjang*lebar*2;
    }

    // method hitung volume
    public double hitungVolume() {
        return hitungLuas() * tinggi; // pakai method parent
    }

    public double hitungVolume2(){
        return hitungVolume2()* tinggi;
    }
}