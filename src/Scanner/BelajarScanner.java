package Scanner;

import java.util.Scanner;

public class BelajarScanner {
    public static void main(String[] args) {
        String nama, alamat;
        int umur;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap\t: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan alamat lengkap\t: ");
        alamat = scanner.nextLine();
        System.out.print("Masukkan umur Anda\t: ");
        umur = scanner.nextInt();
        System.out.println("\nBerdasarkan data yang dimasukkan, \nNama Anda adalah " + nama + " beralamat di " + alamat + " dan umur anda tahun ini  adalaha " + umur);
    }
}
