package sk.stuba.fei.uim.oop;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("zadai");
        String c=scan.nextLine();
        System.out.println(c);
        String a="a";
        String b="a";
        System.out.println("a==b:"+(a.equals(b)));
        System.out.println("a==c:"+(a.equals(c)));

        System.out.println("objectsequals"+ Objects.equals(a,c));


    }
}
