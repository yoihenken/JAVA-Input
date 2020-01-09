package try_catch;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            //Mencoba membaca berkas latihan.txt
            File file = new File("/Users/yoihenken/Documents/data.txt");
            FileReader fr = new FileReader(file);
            //Jika berhasil
            System.out.println("Read file berhasil");

        }catch (SecurityException| IOException e){
            System.out.println(e.getMessage());
        }
    }

}
