public class Peminjaman11 {
    Mahasiswa11 mhs;
    Buku11 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda = 0;
    int biayaDenda = 2000;

    Peminjaman11(Mahasiswa11 mahasiswa, Buku11 buku, int lamaPinjam) {
        this.mhs = mahasiswa;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
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
        System.out.println(mhs.nama + " | " + buku.judul + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
        
    }
}
