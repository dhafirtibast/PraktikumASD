import java.util.Stack;

public class StackSurat11 {
    Surat11[] stack;
    int size, top;

    StackSurat11(int size) {
        this.size = size;
        stack = new Surat11[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void push(Surat11 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    Surat11 pop() {
        if (!isEmpty()) {
            Surat11 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    Surat11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    void print() {
        if (!isEmpty()) {
            System.out.println("Daftar Surat Izin:");
            for (int i = top; i >= 0; i--) {
                Surat11 s = stack[i];
                System.out.println(s.idSurat + "\t" + s.namaMahasiswa + "\t" + s.kelas + "\t" + s.jenisIzin + "\t" + s.durasi);
            }
        } else {
            System.out.println("Tidak ada surat izin.");
        }
    }
    
    void cariSurat(String nama) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                Surat11 s = stack[i];
                System.out.println("Surat ditemukan: " + s.idSurat + "\t" + s.namaMahasiswa + "\t" + s.kelas + "\t" + s.jenisIzin + "\t" + s.durasi);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
        }
    }
}
