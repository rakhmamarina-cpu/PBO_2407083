package latihan_pbo.latihan3_2407083;

public class main {
    public static void main(String[] args) {

        // Persegi Panjang
        persegipanjang pp1 = new persegipanjang();
        pp1.setPanjang(10);
        System.out.println("panjangnya adalah : " + pp1.getPanjang());
        pp1.setLebar(20);
        pp1.cetakLuas();
        System.out.println("luasnya adalah : " + pp1.hitungLuas());

        System.out.println("----------------------");

        // Persegi
        Persegi p1 = new Persegi();
        p1.setSisi(10);
        System.out.println("sisinya adalah : " + p1.getSisi());
        p1.cetakLuas();
        System.out.println("luasnya adalah : " + p1.hitungLuas());
    }
}