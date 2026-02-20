public class MataKuliah11 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah11() {
        kodeMK = "XXX000";
        nama = "Belum ditemukan";
        sks = 0;
        jumlahJam = 0;
    }
    public MataKuliah11(String kodeMK,String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tampilInformasi() {
        System.out.println("Kode MK    : "+kodeMK);
        System.out.println("Nama MK    : "+nama);
        System.out.println("SKS        : "+sks);
        System.out.println("Jumlah Jam : "+jumlahJam);
        System.out.println("-----------------------");
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi: "+sks);
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam ditambah menjadi: "+jumlahJam);
    }
    void kurangiJam(int jam) {
        if (jam <= jumlahJam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam dikurang menjadi: "+jumlahJam);
        } else {
            System.out.println("Jam yang dikurangi melebihi jumlah.");
        }
    }
}
