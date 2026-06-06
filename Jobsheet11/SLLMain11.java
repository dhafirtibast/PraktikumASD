public class SLLMain11 {
    public static void main(String[] args) {
        SingleLinkedList11 sll = new SingleLinkedList11();

        Mahasiswa11 mhs1 = new Mahasiswa11("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa11 mhs2 = new Mahasiswa11("23212201", "Bimon", "2B", 3.8);
        Mahasiswa11 mhs3 = new Mahasiswa11("22212202", "Cintia", "3C", 3.5);
        Mahasiswa11 mhs4 = new Mahasiswa11("21212203", "Dirga", "4D", 3.6);
        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
        
        System.out.println("Data index 1: ");
        sll.getData(1);

        System.out.println("Data mahasiswa a.n Bimon berada pada index: "+sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
