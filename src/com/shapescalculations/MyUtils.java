package com.shapescalculations;

import java.util.Scanner;

public class MyUtils {

    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        float birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu , yukseklik, ucgenCevresi, ucgenAlani,cokgenKenarSayisi,cokgenKenarUzunlugu,cokgenAlani,cokgenCevresi;

        System.out.println("Üçgenin Birinci Kenar Uzunluğunu giriniz:");
        birinciKenarUzunlugu = input.nextFloat();

        System.out.println("Üçgenin İkinci Kenar Uzunluğunu giriniz:");
        ikinciKenarUzunlugu= input.nextFloat();

        System.out.println("Üçgenin Taban Uzunluğunu Giriniz:");
        tabanUzunlugu= input.nextFloat();

        System.out.println("Üçgenin Yüksekliğini Giriniz:");
        yukseklik= input.nextFloat();

        System.out.print("çokgenin kenar sayısını giriniz: ");
        cokgenKenarSayisi = input.nextFloat();
        System.out.print("çokgenin kenar sayisından birinin uzunluğunu giriniz: ");
        cokgenKenarUzunlugu = input.nextFloat();

        ucgenCevresi= ucgenCevresiHesapla(birinciKenarUzunlugu, ikinciKenarUzunlugu, tabanUzunlugu);
        ucgenAlani=ucgenAlaniHesapla(tabanUzunlugu, yukseklik);
        cokgenCevresi=cokgenCevresiHesapla(cokgenKenarSayisi,cokgenKenarUzunlugu);
        cokgenAlani=cokgenAlaniHesapla(cokgenKenarSayisi, cokgenKenarUzunlugu);

        cevreYazdir(ucgenCevresi);
        alanYazdir(ucgenAlani);
        cokgenAlanYazdir(cokgenAlani);
        cokgenCevreYazdir(cokgenCevresi);
    }




    public static float ucgenCevresiHesapla(float x, float y, float z){
        float cevre= x + y + z;
        return cevre;
    }
    public static float ucgenAlaniHesapla (float z, float h){
        float alan= (z*h)/2;
        return alan;
    }
    public static float cokgenCevresiHesapla(float cokgenKenarSayisi, float cokgenKenarUzunlugu) {
        float cevre=cokgenKenarSayisi*cokgenKenarUzunlugu;
        return cevre;
    }

    public static float cokgenAlaniHesapla(float ns, float side) {
        return (float) ((ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns))));
    }
    public static void cevreYazdir(float i){
        System.out.println("Üçgenin Çevresi:"+i);
    }
    public static void alanYazdir(float j){
        System.out.println("Üçgenin Alani:"+j);
    }
    public static void cokgenAlanYazdir(float j){
        System.out.println("Çokgen Alani:"+j);
    }
    public static void cokgenCevreYazdir(float t) {
        System.out.println("Çokgen Çevre:"+t);
    }
}

