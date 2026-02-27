public class MahasiswaDemo11 {
    public static void main(String[] args) {
        Mahasiswa11[] arrayOfMahasiswa11 = new Mahasiswa11[3];
        arrayOfMahasiswa11[0] = new Mahasiswa11();
        arrayOfMahasiswa11[0].nim = "244107060033";
        arrayOfMahasiswa11[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa11[0].kelas = "SIB-1E";
        arrayOfMahasiswa11[0].ipk = (float) 3.75;

        arrayOfMahasiswa11[1] = new Mahasiswa11();
        arrayOfMahasiswa11[1].nim = "2341720172";
        arrayOfMahasiswa11[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa11[1].kelas = "TI-2A";
        arrayOfMahasiswa11[1].ipk = (float) 3.36;

        arrayOfMahasiswa11[2] = new Mahasiswa11();
        arrayOfMahasiswa11[2].nim = "244107023006";
        arrayOfMahasiswa11[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa11[2].kelas = "TI-2E";
        arrayOfMahasiswa11[2].ipk = (float) 3.80;

        System.out.println("NIM   : "+ arrayOfMahasiswa11[0].nim);
        System.out.println("Nama  : "+ arrayOfMahasiswa11[0].nama);
        System.out.println("Kelas : "+ arrayOfMahasiswa11[0].kelas);
        System.out.println("IPK   : "+ arrayOfMahasiswa11[0].ipk);
        System.out.println("------------------------------------");
        
        System.out.println("NIM   : "+ arrayOfMahasiswa11[1].nim);
        System.out.println("Nama  : "+ arrayOfMahasiswa11[1].nama);
        System.out.println("Kelas : "+ arrayOfMahasiswa11[1].kelas);
        System.out.println("IPK   : "+ arrayOfMahasiswa11[1].ipk);
        System.out.println("------------------------------------");
        
        System.out.println("NIM   : "+ arrayOfMahasiswa11[2].nim);
        System.out.println("Nama  : "+ arrayOfMahasiswa11[2].nama);
        System.out.println("Kelas : "+ arrayOfMahasiswa11[2].kelas);
        System.out.println("IPK   : "+ arrayOfMahasiswa11[2].ipk);
        System.out.println("------------------------------------");
    }
}
