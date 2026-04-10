public class SortingMain11 {
    public static void main(String[] args) {
        int a[]= {20,10,2,7,12};
        
        Sorting11 dataurut1 = new Sorting11(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        int b[]= {30, 20, 2, 8, 14};

        Sorting11 dataurut2 = new Sorting11(b, b.length);

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
    }
}
