package patikaDev;

import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        double boy,kilo,vucutIndex;
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu giriniz");
        boy=sc.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        kilo=sc.nextDouble();
        vucutIndex=kilo/Math.pow(boy,2);
        System.out.println("Vucut kitle indeksiniz:"+vucutIndex);

    }
}
