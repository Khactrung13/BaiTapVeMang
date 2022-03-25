/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitapvemang;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    public static void NhapMang(int[] arr , int n){        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = sc.nextInt();            
            }
        System.out.println("Cac phan tu cua mang");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static double TinhTb(int[]arr){
        double ketqua = 0;
        double Sum =0;
        for (int i = 0; i < arr.length; i++) {
             Sum += arr[i]; 
             ketqua = Sum/arr.length;
        }
        System.out.println("\nTrung Binh= "+ ketqua);
        return ketqua;
    }
            
    
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        NhapMang(arr, n);
        TinhTb(arr);
    }
}
