import java.util.Scanner;

public class LayananMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        QueueLinkedList11 antrianLayanan = new QueueLinkedList11(5);
        int pilihan;

        do {
            System.out.println("\n====================================");
            System.out.println("    LAYANAN UNIT KEMAHASISWAAN       ");
            System.out.println("====================================");
            System.out.println("1. Daftarkan Mahasiswa ke Antrian");
            System.out.println("2. Layani Antrian");
            System.out.println("3. Lihat Antrian Terdepan & Paling Akhir");
            System.out.println("4. Cetak Jumlah Mahasiswa yang Mengantre");
            System.out.println("5. Tampilkan Semua Daftar Antrian");
            System.out.println("6. Cek Status Antrian");
            System.out.println("7. Kosongkan Seluruh Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-7): ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- PENDAFTARAN MAHASISWA ---");
                    System.out.print("Masukkan NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama      : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Keperluan : ");
                    String keperluan = sc.nextLine();

                    Mahasiswa11 mhs = new Mahasiswa11(nim, nama, keperluan);
                    antrianLayanan.enqueue(mhs);
                    break;
                case 2:
                    antrianLayanan.dequeue();
                    break;
                case 3:
                    antrianLayanan.lihatUjungAntrian();
                    break;
                case 4:
                    System.out.println("\nJumlah antrean saat ini: " + antrianLayanan.getJumlahAntrian() + " orang.");
                    break;
                case 5:
                    antrianLayanan.tampilkanSemuaAntrian();
                    break;
                case 6:
                    System.out.println("");
                    System.out.println("Antrian kosong: " + antrianLayanan.isEmpty());
                    System.out.println("Antrian penuh: " + antrianLayanan.isFull());
                    break;
                case 7:
                    antrianLayanan.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari sistem layanan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
