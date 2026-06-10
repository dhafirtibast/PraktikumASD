import java.util.Scanner;

public class KasirMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLLAntrean11 antreanList = new SLLAntrean11();
        SLLPesanan11 laporanList = new SLLPesanan11();

        antreanList.enqueue(new Pembeli11("Ainra", "08224500000"));
        antreanList.enqueue(new Pembeli11("Danra", "08224511111"));
        antreanList.enqueue(new Pembeli11("Sanri", "08224522222"));

        int pilihan;
        do {
            System.out.println("====================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("====================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    antreanList.enqueue(new Pembeli11(nama, hp));
                    break;
                
                case 2:
                    antreanList.printAntrian();
                    break;

                case 3:
                    NodePembeli11 antreanDipanggil = antreanList.dequeue();
                    
                    if (antreanDipanggil == null) {
                        System.out.println("Antrean kosong.");
                    } else {
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Nama Pesanan : ");
                        String namaMenu = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine(); 

                        laporanList.addPesanan(new Pesanan11(kode, namaMenu, harga));
                        System.out.println(antreanDipanggil.data.namaPembeli + " telah memesan " + namaMenu);
                    }
                    break;
                case 4:
                    laporanList.printLaporan();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan != 0);
    }
}
