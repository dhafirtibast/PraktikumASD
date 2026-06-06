public class Mahasiswa11 {
    String nim, nama, keperluan;

    public Mahasiswa11() {
    }

    public Mahasiswa11(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilData() {
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("Keperluan : " + keperluan);
        System.out.println("---------------------------------");
    }

    
}