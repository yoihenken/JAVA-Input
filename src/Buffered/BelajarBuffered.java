package Buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BelajarBuffered {
    public static void main(String[] args) {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        String nama = "";
        String alamat = "";
        int umur = 0;

        try{
            System.out.println("Masukkan nama Anda\t: ");
            nama = BR.readLine();
            System.out.println("Masukkan alamat Anda\t: ");
            alamat = BR.readLine();
            System.out.println("Masukkan umur\t: " + umur);
            umur = Integer.parseInt(BR.readLine());
        }catch (IOException E){
            System.out.println("Error 404");
        }
        System.out.println("=================================================");
        System.out.println("Nama Anda\t: " + nama);
        System.out.println("Alamat Anda\t: " + alamat);
        System.out.println("Umur Anda\t: " + umur);
    }
}
