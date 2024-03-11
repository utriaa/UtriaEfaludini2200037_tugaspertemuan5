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

public class Soal1 {
    static int jumlahDeret(int N) {
        return N*(N+1)/2;
    }
    public static void main(String[] args){
        Scanner nilai = new Scanner(System.in);
        System.out.print("Masukan nilai N: ");
        int N = nilai.nextInt();
        
        System.out.println("1+2+3+ ...+" +N+"=" + jumlahDeret(N));
    }
}
