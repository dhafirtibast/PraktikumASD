public class QueueLinkedList11 {
    Node11 head; 
    Node11 tail; 
    int size;
    int maxKapasitas;

    public QueueLinkedList11(int maxKapasitas) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.maxKapasitas = maxKapasitas;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size == maxKapasitas;
    }

    public void enqueue(Mahasiswa11 mhs) {
        if (isFull()) {
            System.out.println("Maaf, antrian penuh! Silakan tunggu beberapa saat.");
            return;
        }

        Node11 newNode = new Node11(mhs, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke dalam antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dapat dipanggil.");
            return;
        }

        System.out.println("\n--- Memanggil Antrian terdepan ---");
        head.data.tampilData();

        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }

    public void lihatUjungAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n===== ANTRIAN TERDEPAN =====");
        head.data.tampilData();

        System.out.println("===== ANTRIAN PALING AKHIR =====");
        tail.data.tampilData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void tampilkanSemuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n========= DAFTAR MAHASISWA MENGANTRE =========");
        Node11 temp = head;
        int no = 1;
        while (temp != null) {
            System.out.println("No. Antrian: " + no++);
            temp.data.tampilData();
            temp = temp.next;
        }
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }
}