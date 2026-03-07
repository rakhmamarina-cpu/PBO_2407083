package latihan_pbo.latihan4_2407083;

public class coba {
    // atribut persegi
    protected double sisi;

    // atribut persegi panjang
    protected double panjang;
    protected double lebar;

    // setter sisi
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // getter sisi (method untuk mengambil atau membaca nilai atribut.)
    public double getSisi(){
        return sisi;
    }

    // setter panjang (method untuk mengisi atau mengubah nilai atribut.)
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    // getter panjang
    public double getPanjang(){
        return panjang;
    }

    // setter lebar
    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    // hitung luas persegi
    public double hitungLuasPersegi(){
        return sisi * sisi;
    }

    // hitung luas persegi panjang
    public double hitungLuasPersegiPanjang(){
        return panjang * lebar;
    }

    // cetak luas persegi
    public void cetakLuasPersegi(){
        System.out.println("Luas Persegi : " + hitungLuasPersegi());
    }

    // cetak luas persegi panjang
    public void cetakLuasPersegiPanjang(){
        System.out.println("Luas Persegi Panjang : " + hitungLuasPersegiPanjang());
    }
}
