public class Mahasiswa11 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa11() {
    }

    public Mahasiswa11(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.printf("%-10s %10s %4s %5s\n", nama, nim, kelas, ipk);
    }
}
