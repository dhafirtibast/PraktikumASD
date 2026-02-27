import java.util.Scanner;

public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah11[] arrayOfMataKuliah11 = new MataKuliah11[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah11.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------");

            arrayOfMataKuliah11[i] = new MataKuliah11(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMataKuliah11.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode       : " + arrayOfMataKuliah11[i].kode);
            System.out.println("Nama       : " + arrayOfMataKuliah11[i].nama);
            System.out.println("Sks        : " + arrayOfMataKuliah11[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah11[i].jumlahJam);
            System.out.println("-------------------------------------");
        }
    }
}
