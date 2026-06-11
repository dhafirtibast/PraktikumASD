public class SLLPesanan11 {
    NodePesanan11 head;
    NodePesanan11 tail;

    void addPesanan(Pesanan11 p) {
        NodePesanan11 nd = new NodePesanan11(p);
        if (head == null) {
            head = tail = nd;
        } else {
            tail.next = nd;
            tail = nd;
        }
    }

    void sortByNama() {
        if (head == null || head.next == null) return;

        NodePesanan11 sortedHead = null;
        NodePesanan11 current = head;
        while (current != null) {
            NodePesanan11 nextNode = current.next;
            if (sortedHead == null || current.data.namaPesanan.compareToIgnoreCase(sortedHead.data.namaPesanan) < 0) {
                current.next = sortedHead;
                sortedHead = current;
            } else {
                NodePesanan11 temp = sortedHead;
                while (temp.next != null && temp.next.data.namaPesanan.compareToIgnoreCase(current.data.namaPesanan) < 0) {
                    temp = temp.next;
                }
                current.next = temp.next;
                temp.next = current;
            }
            current = nextNode;
        }
        head = sortedHead;

        NodePesanan11 tempTail = head;
        while (tempTail != null && tempTail.next != null) {
            tempTail = tempTail.next;
        }
        tail = tempTail;
    }

    void printLaporan() {
        if (head == null) {
            System.out.println("=========================================");
            System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
            System.out.println("=========================================");
            System.out.println("Pesanan kosong.");
            System.out.println("");
            return;
        }
        sortByNama();

        System.out.println("=========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        NodePesanan11 temp = head;
        int total = 0;

        while (temp != null) {
            System.out.printf("%-15d %-20s %-15d\n", temp.data.kodePesanan, temp.data.namaPesanan, temp.data.harga);
            total += temp.data.harga;
            temp = temp.next;
        }
        System.out.println("=========================================");
        System.out.println("Total Pendapatan: Rp " + total);
        System.out.println("");
    }
}

