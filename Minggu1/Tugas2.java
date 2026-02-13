import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);
    static String[][] jadwal;
    static int n = 0;

    public static void inputJadwal() {
        System.out.print("Masukkan jumlah jadwal: ");
        n = sc.nextInt();
        sc.nextLine();
        jadwal = new String[n][4];

        for (int i = 0; i < n; i++) {
            System.out.println("Input jadwal ke-" + (i+1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari: ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam: ");
            jadwal[i][3] = sc.nextLine();
            System.out.println();
        }
    }
    public static void tampilSemuaJadwal() {
        if (jadwal==null) {
            System.out.println("Data jadwal belum diinput!");
            return;
        }
        System.out.println("=== Semua Jadwal Kuliah ===");
        System.out.printf("%-20s %-20s %-10s %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-20s %-10s %-15s\n",
                jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }
    public static void tampilJadwalHari(String hari) {
        if (jadwal==null) {
            System.out.println("Data jadwal belum diinput!");
            return;
        }
        System.out.println("=== Jadwal Hari " + hari + " ===");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-20s %-20s %-10s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }
    public static void tampilJadwalMatkul(String matkul) {
        if (jadwal==null) {
            System.out.println("Data jadwal belum diinput!");
            return;
        }
        System.out.println("=== Jadwal Mata Kuliah " + matkul + " ===");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.printf("%-20s %-20s %-10s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
    }
    public static void menu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Input jadwal");
        System.out.println("2. Tampilkan semua jadwal");
        System.out.println("3. Tampilkan jadwal berdasarkan hari");
        System.out.println("4. Tampilkan jadwal berdasarkan mata kuliah");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu: ");

    }
    public static void main(String[] args) {
        int pilihan;
        do {
            menu(); 
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    inputJadwal();
                    break;
                case 2:
                    tampilSemuaJadwal();
                    break;
                case 3:
                    sc.nextLine(); 
                    System.out.print("Masukkan hari: ");
                    String hari = sc.nextLine();
                    tampilJadwalHari(hari);
                    break;
                case 4:
                    sc.nextLine(); 
                    System.out.print("Masukkan nama mata kuliah: ");
                    String matkul = sc.nextLine();
                    tampilJadwalMatkul(matkul);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}
