import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        int jumlahMK = namaMK.length;
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];
        int[] sks = {2, 3, 2, 3, 2, 3, 2, 2}; 

        double totalNilai = 0;
        int totalSKS = 0;
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A"; bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+"; bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B"; bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+"; bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C"; bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D"; bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E"; bobotNilai[i] = 0.0;
            }

            totalNilai += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalNilai / totalSKS;

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("Mata Kuliah                        Nilai Angka   Nilai Huruf   Bobot Nilai");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-30s %10.2f   %-10s   %.2f\n",
                              namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("\nTotal SKS: " + totalSKS);
        System.out.printf("IP Semester: %.2f\n", ipSemester);
    }
}