package tugas_pbo.tugas3_pbo;

public class Main {
    public static void main(String[] args) {

        BangunDatar b1 = new Persegi(4);
        BangunDatar b2 = new PersegiPanjang(5, 3);
        BangunDatar b3 = new Segitiga(6, 2);

        b1.tampilkan();
        System.out.println();

        b2.tampilkan();
        System.out.println();

        b3.tampilkan();
    }
}
