import java.util.Scanner;

public class Tugas1 {
    // Fungsi Rekursif
    static void deretDescendingRekursif(int n) {
        if (n < 0) {
            return; // Base case: jika n < 0, hentikan rekursi
        }
        System.out.print(n + " ");
        deretDescendingRekursif(n - 1); // Rekursif dengan n - 1
    }

    // Fungsi Iteratif
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        
        System.out.println("\nDeret menggunakan Rekursif:");
        deretDescendingRekursif(n);
        
        System.out.println("\n\nDeret menggunakan Iteratif:");
        deretDescendingIteratif(n);
        
        sc.close();
    }
}
