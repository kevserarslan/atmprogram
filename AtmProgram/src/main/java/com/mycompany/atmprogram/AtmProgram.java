/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.atmprogram;

import java.util.Scanner;

/**
 *
 * @author Kevser
 */
public class AtmProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        System.out.println("***********************");
        String islemler = "1.İşlem: Bakiye Öğrenme\n"
                + "2.İşlem: Para Çekme\n"
                + "3.işlem: Para Yatırma\n"
                + "Çikiş için q' a basın";
        System.out.println(islemler);
        System.out.println("***********************");

        while (true) {
            System.out.println("İşlem seçiniz:");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("sistemden çikiş yapılıyor.");
                break;
            } else if (islem.equals("1")) {
                System.out.println("bakiyeniz:" + bakiye);
            } else if (islem.equals("2")) {
                System.out.println("Çekmek istediğiniz tutar");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                if ((bakiye - tutar) < 0) {
                    System.out.println("Yeterli bakiyrniz bulunmamaktadır" + bakiye);
                }
                else{
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz:"+bakiye);
                }

            }else if(islem.equals("3")){
                System.out.println("yatırılıcak tutarı giriniz");
                int yatırılıcaktutar = scanner.nextInt();
                scanner.nextLine();
                bakiye += yatırılıcaktutar;
                System.out.println("yeni bakiyeniz:"+ bakiye);
              
            }
            else{
                System.out.println("Geçersiz işlem");
                    
            }

        }
        
    }

}

