import java.io.Console;

public class InputConsole {
    public static void main(String[] args) {
        String nama;
        int usia = 0;
        Console csl = System.console();
        System.out.println("Masukkan Nama\t: ");
        nama = csl.readLine();
        System.out.println("Masukkan Umur\t: ");
        usia = Integer.parseInt(csl.readLine());

        System.out.println("Namamu adalah :" + nama);
        System.out.println("Saat ini berusia :" + usia);
    }
}