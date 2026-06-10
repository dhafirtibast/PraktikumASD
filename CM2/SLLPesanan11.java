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

        boolean swapped;
        do {
            swapped = false;
            NodePesanan11 tempCurrent = head;

            while (tempCurrent.next != null) {
                if (tempCurrent.data.namaPesanan.compareToIgnoreCase(tempCurrent.next.data.namaPesanan) > 0) {
                    Pesanan11 tempData = tempCurrent.data;
                    tempCurrent.data = tempCurrent.next.data;
                    tempCurrent.next.data = tempData;
                    
                    swapped = true;
                }
                tempCurrent = tempCurrent.next;
            }
        } while (swapped);
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

