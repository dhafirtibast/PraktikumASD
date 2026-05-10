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
        if (isFull()) {
            top++;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    Mahasiswa11 pop() {
        if (isEmpty()) {
            Mahasiswa11 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("STack kosong! Tidak ada tugas untuk dinilai.");
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
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
