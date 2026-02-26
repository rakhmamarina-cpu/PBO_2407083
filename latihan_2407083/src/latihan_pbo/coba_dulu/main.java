package latihan_pbo.coba_dulu;

public class main {
    public static void main(String[] args) {
        coba pp1 = new coba();

        pp1.setPanjang(9);
        System.out.println("panjangnya adalah : "+ pp1.getPanjang());
        pp1.setLebar(13);
        pp1.cetakLuas();
        System.out.println("luasnya adalah : "+ pp1.hitungLuas());
    }
}
