public class DosenMain11 {
    public static void main(String[] args) {
        Dosen11 dsn1 = new Dosen11();
        dsn1.idDosen = "02OKEGAS";
        dsn1.nama = "Joko Wibowo";
        dsn1.statusAktif = false;
        dsn1.tahunGabung = 2014;
        dsn1.bidangKeahlian = "Sawit";

        dsn1.tampilkanInformasi();
        dsn1.setStatusAktif(true);
        dsn1.hitungMasaKerja(2026);
        dsn1.ubahKeahlian("CEO MBG");
        dsn1.tampilkanInformasi();

        Dosen11 dsn2 = new Dosen11("DHF01486", "Dhafir Tsabit", true, 2024, "Industri");
        dsn2.setStatusAktif(false);
        dsn2.ubahKeahlian("Oposisi Pemerintah");
        dsn2.hitungMasaKerja(2026);
        dsn2.tampilkanInformasi();

    }
}
