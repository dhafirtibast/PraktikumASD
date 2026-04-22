public class Peminjaman11 {
    Mahasiswa11 mhs;
    Buku11 buku;
    String kategoriLamaPinjam = null;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda = 0;
    int biayaDenda = 2000;

    Peminjaman11(Mahasiswa11 mahasiswa, Buku11 buku, int lamaPinjam, String kategoriLamaPinjam) {
        this.mhs = mahasiswa;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.kategoriLamaPinjam = kategoriLamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * biayaDenda;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        //Modifikasi A3
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama Peminjaman: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda + " | Kategori Lama Peminjaman: " + kategoriLamaPinjam);
        
    }

    //Modifikasi A3
    void hitungRataRataLamaPinjam(Peminjaman11[] pinjam) {
        int totalLamaPinjam = 0;
        for (int i = 0; i < pinjam.length; i++) {
            totalLamaPinjam += pinjam[i].lamaPinjam;
        }
        double rataRata = totalLamaPinjam / pinjam.length;
        System.out.println("Rata-rata lama peminjaman: " + rataRata + " hari");
    }
}