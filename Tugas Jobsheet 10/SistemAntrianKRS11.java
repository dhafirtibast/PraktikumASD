import java.util.Scanner;

public class SistemAntrianKRS11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS11 antrian = new AntrianKRS11(10);
        int pilihan;

        do {
            System.out.println("\n=============================================");
            System.out.println("    SISTEM ANTRIAN KRS DOSEN PEMBINA (DPA)   ");
            System.out.println("=============================================");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil & Proses KRS (2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Cetak Statistik & Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-7): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    
                    Mahasiswa11 mhs = new Mahasiswa11(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("\n========= STATISTIK LAYANAN KRS =========");
                    System.out.println("Jumlah mahasiswa dalam antrian saat ini : " + antrian.getJumlahAntrian());
                    System.out.println("Total mahasiswa SUDAH proses KRS        : " + antrian.getJumlahSudahKRS());
                    System.out.println("Sisa kuota mahasiswa BELUM proses KRS   : " + antrian.getBelumKRS() + " / 30");
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}