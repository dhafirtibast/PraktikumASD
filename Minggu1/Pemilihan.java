import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        System.out.print("Masukkan nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan nilai Kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = input.nextDouble();
     
        if (!validasiNilai(tugas)||!validasiNilai(kuis)||!validasiNilai(uts)||!validasiNilai(uas)) {
            System.out.println("nilai tidak valid");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            String huruf = konversiHuruf(nilaiAkhir);
            String status = (huruf.equals("D") || huruf.equals("E")) ? "TIDAK LULUS" : "LULUS";
            System.out.println("Nilai Akhir: " + String.format("%.2f", nilaiAkhir));
            System.out.println("Nilai Huruf: " + huruf);
            System.out.println("Keterangan: " + status);
        }

    } 
    public static boolean validasiNilai(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }
    public static String konversiHuruf(double nilai) {
        if (nilai >= 85) return "A";
        else if (nilai >= 75) return "B+";
        else if (nilai >= 70) return "B";
        else if (nilai >= 65) return "C+";
        else if (nilai >= 60) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }
   
}
