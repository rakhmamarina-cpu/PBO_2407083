package latihan_pbo.latihan3_2407083;

public class persegipanjang{
    protected double panjang;
    protected double lebar;

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public double getPanjang(){
        return panjang;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public void cetakLuas(){
        System.out.println("luasnya adalah : " + (panjang * lebar));
    }

    public double hitungLuas(){
        double Luas = panjang * lebar;
        return Luas;
    }
}
