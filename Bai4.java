/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitapvemang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4 {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    public static void MangNgauNhienInt(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
//        System.out.println("Cac phan tu cua mang la:");
//        System.out.println(Arrays.toString(arr));

        System.out.println("Cac phan tu cua mang la:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void DuyetMangTuTraiSangPhai(int[] arr){
        System.out.println("\nDuyet mang tu trai sang phai:");
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void DuyetMangTuPhaiSangTrai(int[] arr  ){
        System.out.println("\nDuyet mang tu phai sang trai : " );
      
        for (int i = 0, j = arr.length-1; i < j; i++, j--){
            int temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;

        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        System.out.print("Nhap so luong phan tu cua mang ngau nhien:");
        int n =sc.nextInt();
        int[] arr =new int[n];
        MangNgauNhienInt(arr);
        DuyetMangTuTraiSangPhai(arr);
        DuyetMangTuPhaiSangTrai(arr);
    }
}
