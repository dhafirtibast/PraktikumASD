package Kuis1;

public class Karyawan11 {
       String idPegawai;
       String nama;
       double gajiPokok;
       int hariKerja;

       Karyawan11() {

       }

       Karyawan11(String idPegawai, String nama, double gajiPokok, int hariKerja) {
              this.idPegawai = idPegawai;
              this.nama = nama;
              this.gajiPokok = gajiPokok;
              this.hariKerja = hariKerja;
       }

       void tampilkanInformasi() {
              System.out.println("Id Pegawai     : " + idPegawai);
              System.out.println("Nama           : " + nama);
              System.out.println("Gaji Pokok     : " + gajiPokok);
              System.out.println("Hari Kerja     : " + hariKerja);
       }

       double hitungGajiBulanan () {
              double totalGaji=0;
              totalGaji = gajiPokok * (hariKerja/25.0);
              System.out.println("Total Gaji     : "+totalGaji);
              System.out.println("------------------------------");
              return totalGaji;
       }
}
