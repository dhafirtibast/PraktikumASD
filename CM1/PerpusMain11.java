import java.util.Scanner;

public class PerpusMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Mahasiswa11[] mhs = {
            new Mahasiswa11("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa11("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa11("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku11[] buku = {
            new Buku11("B001", "Algoritma", 2020),
            new Buku11("B002", "Basis Data", 2019),
            new Buku11("B003", "Pemrograman", 2021),
            new Buku11("B004", "Fisika", 2024)
        };

        Peminjaman11[] pinjam = {
            new Peminjaman11(mhs[0], buku[0], 7),
            new Peminjaman11(mhs[1], buku[1], 3),
            new Peminjaman11(mhs[2], buku[2], 10),
            new Peminjaman11(mhs[2], buku[3], 6),
            new Peminjaman11(mhs[0], buku[1], 4)
        };

        int pilihan;
        do {
            System.out.println("\n--- SISTEM PEMINJAMAN RUANG BACA JTI ---");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Data Mahasiswa ---");
                    for (Mahasiswa11 m : mhs) m.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("\n--- Data Buku ---");
                    for (Buku11 b : buku) b.tampilBuku();
                    break;
                case 3:
                    System.out.println("\n--- Data Peminjaman ---");
                    for (Peminjaman11 p : pinjam) p.tampilPeminjaman();
                    break;
                case 4:
                    
                    for (int i = 0; i < pinjam.length-1; i++) {
                        int max = i;
                        for (int j = i+1; j < pinjam.length; j++) {
                            if (pinjam[j].lamaPinjam > pinjam[max].lamaPinjam) {
                                max = j;
                            }
                        }
                        Peminjaman11 temp = pinjam[i];
                        pinjam[i] = pinjam[max];
                        pinjam[max] = temp;
                    }

                    System.out.println("\n--- Setelah Diurutkan Berdasarkan Denda Terbesar ---");
                    for (Peminjaman11 p : pinjam) p.tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNIM = sc.nextLine();
                    boolean found = false;
                    
                    System.out.println("\n--- Hasil Pencarian NIM " + cariNIM + " ---");
                    for (Peminjaman11 p : pinjam) {
                        if (p.mhs.nim.equals(cariNIM)) {
                            p.tampilPeminjaman();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Data dengan NIM " + cariNIM + " tidak ditemukan.");
                    }
                    break;
                case 0:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}