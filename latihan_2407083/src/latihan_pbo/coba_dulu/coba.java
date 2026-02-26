package latihan_pbo.coba_dulu;

public class coba {
    protected double panjang;
    protected double lebar;
    protected double sisi;

    //method
    //setter

    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    //getter
    public double getPanjang(){
        return panjang;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public void cetakLuas(){
        System.out.println("luasnya adalah : "+ (panjang * lebar));
    }

    public double hitungLuas(){
        double Luas = panjang * lebar;
        return Luas;
    }
}
