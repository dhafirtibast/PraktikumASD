public class AntrianKRS11 {
    Mahasiswa11[] data;
    int front, rear, size, max;
    int totalSudahKRS = 0;
    int totalKapasitasDPA = 30;

    public AntrianKRS11(int n) {
        max = n;
        data = new Mahasiswa11[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian memang sudah kosong.");
        }
    }

    public void tambahAntrian(Mahasiswa11 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Silakan tunggu beberapa saat.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil mendaftar ke dalam antrian.");
    }

    public void panggilKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dipanggil.");
            return;
        }
        
        System.out.println("\n--- Memproses KRS ---");
        int jumlahDipanggil = (size < 2) ? size : 2;
        
        for (int i = 0; i < jumlahDipanggil; i++) {
            Mahasiswa11 mhs = data[front];
            System.out.print("Diproses -> ");
            mhs.tampilkanData();
            
            front = (front + 1) % max;
            size--;
            totalSudahKRS++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n================ DAFTAR ANTRIAN KRS ================");
        System.out.printf("%-4s %-12s %-15s %-8s %-5s\n", "No.", "NIM", "NAMA", "PRODI", "KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ".  ");
            data[index].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n========= 2 MAHASISWA ANTRIAN TERDEPAN =========");
        System.out.printf("%-12s %-15s %-8s %-5s\n", "NIM", "NAMA", "PRODI", "KELAS");
        int jumlah = (size < 2) ? size : 2;
        for (int i = 0; i < jumlah; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("\n============ MAHASISWA PALING AKHIR ============");
            System.out.printf("%-12s %-15s %-8s %-5s\n", "NIM", "NAMA", "PRODI", "KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahKRS() {
        return totalSudahKRS;
    }

    public int getBelumKRS() {
        int belum = totalKapasitasDPA - totalSudahKRS;
        return (belum < 0) ? 0 : belum;
    }
}