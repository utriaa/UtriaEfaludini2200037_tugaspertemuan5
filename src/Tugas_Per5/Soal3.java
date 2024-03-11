/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Per5;

/**
 *
 * @author UTRIA
 */
import java.util.Scanner;
public class Soal3 {
    static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1; }
        int hasil = 1;
        for (int i = 2; i <= n; i++) {
            hasil *= i; }
        return hasil; }
    
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai n untuk menghitung n!: ");
        int n = masukan.nextInt();

        int faktor = faktorial(n);
        System.out.println(n + "! = " + faktor);
    }
}
