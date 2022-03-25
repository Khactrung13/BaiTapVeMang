/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitapvemang;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {
    static Scanner sc = new Scanner(System.in);
    public static void MangNgauNhien(int[] arr , int n){
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        System.out.println("Cac phan tu cua mang ngau nhien la");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static double TinhTb(int[] arr){
        double ketqua =0;
        double Sum =0;
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
            ketqua = Sum/arr.length;
        }
        System.out.println("\nTrung Binh = " + ketqua);
        return ketqua;
    }
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang ngau nhien:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        MangNgauNhien(arr, n);
        TinhTb(arr);
    }
}
