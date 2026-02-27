public class DataDosen11 {
    void dataSemuaDosen11(Dosen11[] arrayOfDosen11) {
        for (int i = 0; i < arrayOfDosen11.length; i++) {
            System.out.println("Data semua dosen");
            arrayOfDosen11[i].tampilkanData();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen11) {
        int pria = 0, wanita = 0;
        for (Dosen11 d : arrayOfDosen11) {
            if (d.jenisKelamin == true) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen per Jenis Kelamin");
        System.out.println("Pria   : "+ pria);
        System.out.println("Wanita : "+ wanita);
    }

    void rerataUsiaDosenPerJK(Dosen11[] arrayOfDosen11) {
        int totalPria = 0, jmlPria = 0;
        int totalWanita = 0, jmlWanita = 0;

        for (Dosen11 d : arrayOfDosen11) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }
        System.out.println("Rerata usia dosen per jenis kelamin");
        if (jmlPria > 0) {
            System.out.println("Pria : " + (totalPria/jmlPria));
        } else {
            System.out.println("Pria : Tidak ada data");
        }
        if (jmlWanita > 0) {
            System.out.println("Wanita : " + (totalWanita/jmlWanita));
        } else {
            System.out.println("Wanita : Tidak ada data");
        }
    }

    void infoDosenPalingTua(Dosen11[] arrayOfDosen11) {
        Dosen11 tertua = arrayOfDosen11[0];
        for (Dosen11 d : arrayOfDosen11) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("Dosen paling tua");
        tertua.tampilkanData();
    }

    void infoDosenPalingMuda(Dosen11[] arrayOfDosen11) {
        Dosen11 termuda = arrayOfDosen11[0];
        for (Dosen11 d : arrayOfDosen11) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("Dosen paling muda");
        termuda.tampilkanData();
    }

}
