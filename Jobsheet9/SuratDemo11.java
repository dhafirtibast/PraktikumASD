import java.util.Scanner;

public class SuratDemo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat11 stack = new StackSurat11(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char izin = scan.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat11 s = new Surat11(id, nama, kelas, izin, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat11 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat izin dari " + diproses.namaMahasiswa + " (" + diproses.jenisIzin + ")");
                    }
                    break;

                case 3:
                    Surat11 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari " + terakhir.namaMahasiswa + " (" + terakhir.jenisIzin + ")");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
