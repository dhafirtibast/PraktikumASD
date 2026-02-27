import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa11[] arrayOfMahasiswa11 = new Mahasiswa11[3];
        String dummy;
        
        for (int i = 0; i < arrayOfMahasiswa11.length; i++) {
            arrayOfMahasiswa11[i] = new Mahasiswa11();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa11[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa11[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa11[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa11[i].ipk = Float.parseFloat(dummy);
            System.out.println("--------------------------------------");
            
        }

        for (int i = 0; i < arrayOfMahasiswa11.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayOfMahasiswa11[i].cetakInfo();

        }
    }
}
