import java.util.Scanner;

public class KitleIndeksi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy=input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        int kilo=input.nextInt();
        double VKT=kilo/(boy * boy);
        System.out.println("Vücut Kitle İndeksiniz :"+VKT);
    }
}
