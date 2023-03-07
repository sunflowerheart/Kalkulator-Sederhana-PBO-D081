/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;

/**
 *
 * @author yafiaryamaulana
 */
import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        Scanner inputUser;
        float nilai_a,nilai_b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.println("Yafi Arya Maulana-21081010135");
        System.out.println("-------------------");
        System.out.println("Program Kalkulator");
        System.out.println("-------------------");
        System.out.print("nilai a = ");
        nilai_a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        nilai_b = inputUser.nextFloat();

        switch(operator){
            case "+":
                //penjumlahan
                hasil = nilai_a + nilai_b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                //pengurangan
                hasil = nilai_a - nilai_b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                //perkalian
                hasil = nilai_a * nilai_b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                //pembagian
                hasil = nilai_a / nilai_b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }
    }
  }  