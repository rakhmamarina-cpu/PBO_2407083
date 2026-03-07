package latihan_pbo.latihan3_2407083;

public class Persegi{
    protected double sisi;

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void cetakLuas(){
        System.out.println("luasnya adalah : " + (sisi * sisi));
    }

    public double hitungLuas(){
        double Luas = sisi * sisi;
        return Luas;
    }
}