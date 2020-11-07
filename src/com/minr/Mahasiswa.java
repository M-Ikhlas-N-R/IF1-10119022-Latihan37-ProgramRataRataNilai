package com.minr;

import java.util.Scanner;

public class Mahasiswa {
    private int banyakMhs;
    private float jumlahNilai;

    public void setBanyakMhs() {
        // membuat scanner baru
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Banyak Mahasiswa : ");
        this.banyakMhs = userInput.nextInt();
        this.setNilai();
    }

    private void setNilai(){
        float nilaiMhs;
        Scanner userInput = new Scanner(System.in);

        for (int i = 1; i <= this.banyakMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilaiMhs = userInput.nextFloat();
            this.jumlahNilai += nilaiMhs;
        }
    }

    private float getRataRata(){
        return this.jumlahNilai/this.banyakMhs;
    }

    public void getResult(){
        System.out.println("Maka, Rata=rata Nilainya adalah " + this.getRataRata());
        System.out.println("Developed by Rizki Adam Kurniawan");
    }
}
