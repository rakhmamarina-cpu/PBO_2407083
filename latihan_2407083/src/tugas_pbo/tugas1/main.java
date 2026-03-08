package tugas_pbo.tugas1;
    import java.util.Scanner;
public class main {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            int pilihan;
    
            System.out.println("=== MENU BANGUN DATAR ===");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Jajar Genjang");
            System.out.print("Pilih bangun datar: ");
            pilihan = input.nextInt();
    
            switch (pilihan) {
    
                case 1:
                    persegi p = new persegi();
                    System.out.print("Masukkan sisi: ");
                    double sisi = input.nextDouble();
    
                    p.setSisi(sisi);
    
                    System.out.println("Luas Persegi = " + p.LuasPersegi());
                    break;
    
                case 2:
                    PersegiPanjang pp = new PersegiPanjang();
    
                    System.out.print("Masukkan panjang: ");
                    double panjang = input.nextDouble();
    
                    System.out.print("Masukkan lebar: ");
                    double lebar = input.nextDouble();
    
                    pp.setPanjang(panjang);
                    pp.setLebar(lebar);
    
                    System.out.println("Luas Persegi Panjang = " + pp.LuasPersegiPanjang());
                    break;
    
                case 3:
                    SegiTiga st = new SegiTiga();
    
                    System.out.print("Masukkan alas: ");
                    double alas = input.nextDouble();
    
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();
    
                    st.setAlas(alas);
                    st.setTinggi(tinggi);
    
                    System.out.println("Luas Segitiga = " + st.LuasSegiTiga());
                    break;
    
                case 4:
                    JajarGenjang jg = new JajarGenjang();
    
                    System.out.print("Masukkan alas: ");
                    double alasJG = input.nextDouble();
    
                    System.out.print("Masukkan tinggi: ");
                    double tinggiJG = input.nextDouble();
    
                    jg.setAlas(alasJG);
                    jg.setTinggi(tinggiJG);
    
                    System.out.println("Luas Jajar Genjang = " + jg.LuasJajarGenjang());
                    break;
    
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
    
        }
    }