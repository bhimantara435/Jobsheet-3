import java.util.Scanner;
public class Segitiga22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        System.out.println("Masukkan alas: "); alas = sc.nextInt(22);
        System.out.println("Masukkan tinggi: "); tinggi = sc.nextInt(12);
        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);

    }
}
