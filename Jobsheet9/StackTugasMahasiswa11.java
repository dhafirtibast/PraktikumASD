public class StackTugasMahasiswa11 {
    Mahasiswa11[] stack;
    int top; 
    int size;

    StackTugasMahasiswa11(int size) {
        this.size = size;
        stack = new Mahasiswa11[size];
        top = -1;
    }

    boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Mahasiswa11 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    Mahasiswa11 pop() {
        if (!isEmpty()) {
            Mahasiswa11 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    Mahasiswa11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    void print() {
        // Urutan tugas harusnya dari yang terakhir ke yang pertama mengumpulkan (Pertanyaan nomor 1)
        for (int i = top; i >= 0; i--) { 
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    //Modifikasi (Pertanyaan nomor 4)
    void lihatTugasTerbawah() {
        if (!isEmpty()) {
            System.out.println("Tugas pertama dikumpulkan oleh " + stack[0].nama);
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
        }
    }

    //Modifikasi (Pertanyaan nomor 5)
    int dikumpulkan() {
        return top + 1;
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi11 stack = new StackKonversi11();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
