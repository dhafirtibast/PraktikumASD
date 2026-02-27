import java.util.Scanner;

public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data: ");
        int jml = sc.nextInt();
        sc.nextLine();
        MataKuliah11[] arrayOfMataKuliah11 = new MataKuliah11[jml];
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

            arrayOfMataKuliah11[i] = new MataKuliah11("", "", 0, 0);
            arrayOfMataKuliah11[i].tambahdata(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMataKuliah11.length; i++) {
            arrayOfMataKuliah11[i].cetakinfo();
        }

        

    }
}
