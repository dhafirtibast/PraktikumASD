import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: "); // Modif input jumlah mahasiswa
        int jumMhs=sc.nextInt(); // Modif input jumlah mahasiswa
        sc.nextLine();

        MahasiswaBerprestasi11 list = new MahasiswaBerprestasi11(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("---------------------------------------------");
            Mahasiswa11 m = new Mahasiswa11(nim, nama, kelas, ipk);
            list.tambah(m);
        }

       // System.out.println("Data mahasiswa sebelum sorting: ");
       // list.tampil();
//
       // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
       // list.bubbleSort();
       // list.tampil();
//
       // System.out.println("Data mahasiswa setelah sorting dengan Selection Sort (ASC):");
       // list.selectionSort();
       // list.tampil();
//
       // System.out.println("Data mahasiswa setelah sorting dengan Insertion Sort (ASC):");
       // list.insertionSort();
       // list.tampil();
//
       // System.out.println("Data mahasiswa setelah sorting dengan Insertion Sort (DESC):");
       // list.insertionSortDescending();
       // list.tampil();

        //Jobsheet 6
        list.tampil();

        System.out.println("--------------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("--------------------------------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------------------------------------");
        int posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        list.tampilPosisi(cari, posisi2);
        list.tampilDataSearch(cari, posisi2);
    }
}
