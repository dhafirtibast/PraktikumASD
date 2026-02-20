public class MataKuliahMain11 {
    public static void main(String[] args) {
        MataKuliah11 mk1 = new MataKuliah11();
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.kurangiJam(2);
        mk1.tambahJam(4);
        mk1.tampilInformasi();

        MataKuliah11 mk2 = new MataKuliah11("IF101", "Pemrograman Dasar", 3, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);
        mk2.tampilInformasi();
      
    }
}
