package Kuis1;

public class KaryawanMain11 {
    public static void main(String[] args) {
        Karyawan11[] karyawan11 = new Karyawan11[4];
        karyawan11[0] = new Karyawan11("116", "Irfan", 2500000, 20);
        karyawan11[1] = new Karyawan11("123", "Timina", 2750000, 24);
        karyawan11[2] = new Karyawan11("134", "Luvi", 2500000, 25);
        karyawan11[3] = new Karyawan11("147", "Siti", 3000000, 24);

        for (int i = 0; i < karyawan11.length; i++) {
            karyawan11[i].tampilkanInformasi();
            karyawan11[i].hitungGajiBulanan();
        }
    }
}
