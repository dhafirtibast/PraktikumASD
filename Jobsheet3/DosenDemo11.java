import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jml = sc.nextInt();
        sc.nextLine();

        Dosen11[] dosen11 = new Dosen11[jml];

        for (int i = 0; i < dosen11.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();          
            System.out.print("Nama          : ");
            String Nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            dosen11[i] = new Dosen11(kode, Nama, jenisKelamin, usia);
            System.out.println("----------------------------");
        }

        System.out.println();
        System.out.println("--- Data Dosen ---");
        for (Dosen11 d : dosen11) {
            d.tampilkanData();
        }

    }
}
