public class Mahasiswa11 {
    String nim, nama, prodi, kelas;

    public Mahasiswa11(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.printf("%-12s %-15s %-8s %-5s\n", nim, nama, prodi, kelas);
    }
}
