import java.util.Scanner;

public class Tugas2 {
    static int hitungPenjumlahan(int f) {
        if (f == 0) {
            return 0;
        } else {
            return f + hitungPenjumlahan(f - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai f: ");
        int f = sc.nextInt();

        System.out.println("Penjumlahan dari 1 hingga " + f + " = " + hitungPenjumlahan(f));

        sc.close();
    }
}
