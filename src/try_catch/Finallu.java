package try_catch;

public class Finallu {
    public static void main(String[] args) {
        int[] a = new int[5];

        try{
            System.out.println("Akses elemen ke 5\t: " + a[5]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown\t: " + e);
        }finally {
            a[4] = 10;
            System.out.println("Nilai elemen terakhir\t: " + a[4]);
        }
    }

}
