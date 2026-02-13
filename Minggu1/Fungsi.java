public class Fungsi {
    static int hargaAglonema = 75000;
    static int hargaKeladi = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar = 10000;

    public static int hitungPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        return (aglonema * hargaAglonema) +
               (keladi * hargaKeladi) +
               (alocasia * hargaAlocasia) +
               (mawar * hargaMawar);
    }

    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {
        int[][] stok = {
            {10, 5, 15, 7},   //RG1
            {6, 11, 9, 12},   //RG2
            {2, 10, 10, 5},   //RG3
            {5, 7, 12, 9}     //RG4
        };

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(stok[i][0], stok[i][1], stok[i][2], stok[i][3]);
            String status = statusCabang(pendapatan);
            System.out.println("RoyalGarden " + (i+1) + " : Rp" + pendapatan + " - " + status);
        }
    }
}