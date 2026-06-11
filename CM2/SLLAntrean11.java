public class SLLAntrean11 {
    NodePembeli11 head;
    NodePembeli11 tail;
    int noAntreAuto = 0;

    void enqueue(Pembeli11 p) {
        noAntreAuto++; 
        NodePembeli11 nd = new NodePembeli11(noAntreAuto, p);
        if (head == null) {
            head = tail = nd;
        } else {
            tail.next = nd; 
            tail = nd;      
        }
        System.out.println("Antrean berhasil ditambahkan dengan nomor: " + noAntreAuto);
    }

    void printAntrian() {
        if (head == null) {
            System.out.println("=============================");
            System.out.println("Daftar Antrean Pembeli");
            System.out.println("=============================");
            System.out.println("Antrean kosong.");
            System.out.println("");
            return;
        }

        System.out.println("=============================");
        System.out.println("Daftar Antrean Pembeli");
        System.out.println("=============================");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrean", "Nama", "No HP");
        
        NodePembeli11 temp = head;
        while (temp != null) {
            System.out.printf("%-12d %-15s %-15s\n", temp.noAntrean, temp.data.namaPembeli, temp.data.noHp);
            temp = temp.next;
        }
        System.out.println("");
    }

    NodePembeli11 dequeue() {
        if (head == null) {
            return null;
        }
        NodePembeli11 temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return temp;
    }
}