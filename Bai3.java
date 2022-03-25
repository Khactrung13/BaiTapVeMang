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
public class Bai3 {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    public static void MangNgauNhienInt(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        System.out.println("Cac phan tu cua mang la:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void MangNgauNhienDouble(double[] brr){
        for (int i = 0; i < brr.length; i++) {
            brr[i] = rd.nextDouble(1);
        }
        System.out.println("\nCac phan tu cua mang la:");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i]+ " ");
        }
    }
    public static double TinhTb(int[] arr ,double[] brr ,int n){
        double ketqua =0;
        double Sum=0;
        for (int i = 0; i < n; i++) {
            Sum += arr[i] *brr[i];
            ketqua = Sum/n;
        }
        System.out.println("\nTrung Binh Trong SO =" +ketqua);
        return ketqua;
    }
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang ngau nhien:");
        int n =sc.nextInt();
        int[] arr =new int[n];
        MangNgauNhienInt(arr);
        double[] brr = new double[n];
        MangNgauNhienDouble(brr);
        TinhTb(arr, brr, n);
    }
}
