public class Dosen11 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunGabung;
    String bidangKeahlian;

    public Dosen11() {
        
    }
    public Dosen11(String id, String nm, boolean stats, int thnJoin, String specialty) {
        idDosen = id;
        nama = nm;
        statusAktif = stats;
        tahunGabung = thnJoin;
        bidangKeahlian = specialty;
    }
    void tampilkanInformasi() {
        System.out.println("ID Dosen        : "+ idDosen);
        System.out.println("Nama            : "+ nama);
        System.out.println("Status Aktif    : "+ statusAktif);
        System.out.println("Tahun Bergabung : "+ tahunGabung);
        System.out.println("Bidang Keahlian : "+ bidangKeahlian);
        System.out.println("----------------------------------");
    }
    void setStatusAktif(boolean status) {
        statusAktif = status;
    }
    int hitungMasaKerja(int thnSkrg) {
        if (tahunGabung == 0) {
            System.out.println("Tahun bergabung tidak ditemukan.");
            return 0;
        }
        int masaKerja = thnSkrg - tahunGabung;
        System.out.println("Masa kerja dosen: "+masaKerja+" tahun.");
        return masaKerja;
    }
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
