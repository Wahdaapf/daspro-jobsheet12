public class Tugas3 {

    public static int hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        }
        return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
    }

    public static void main(String[] args) {
        int bulan = 12; 
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah: " + hitungPasanganMarmut(bulan));
        System.out.printf("%-10s%-20s%-15s%-15s\n", "Bulan", "Jumlah Pasangan", "Produktif", "Belum Produktif");
        int produktif = 0, belumProduktif = 1;

        for (int i = 1; i <= bulan; i++) {
            int totalPasangan = hitungPasanganMarmut(i);

            if (i > 2) {
                produktif = hitungPasanganMarmut(i - 2); 
            }
            belumProduktif = totalPasangan - produktif;

            System.out.printf("%-10d%-20d%-15d%-15d\n", i, totalPasangan, produktif, belumProduktif);
        }
    }
}
