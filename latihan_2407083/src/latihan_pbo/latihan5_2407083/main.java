package latihan_pbo.latihan5_2407083;

public class main {
    public static void main(String[] args) {
        SegiTiga sTiga = new SegiTiga();

        sTiga.setAlas(2);
        sTiga.setTinggi(3);
        System.out.println("Luas segitiga adalah : " + sTiga.LuasSegiTiga());

    JajarGenjang jg = new JajarGenjang();
        jg.setAlas(8);
        jg.setTinggi(6);

        System.out.println("Luas Jajar Genjang = " + jg.LuasJajarGenjang());

    }
}
