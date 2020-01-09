package try_catch;

public class Multi {
    public static void main(String[] args) {
        try {
            String[] siswa = new String[2];
            siswa[0] = "Wildan";
            siswa[1] = "Ferdi";
            siswa[2] = "Taufiq";
            System.out.println(siswa[4]);
            int angka = 7;
            int hasil = angka / 0;
            System.out.println(hasil);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Data Array Yang Ingin Dikeluarkan Tidak Ada");
        } catch (ArithmeticException ex2) {
            System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
        }
    }
}
