package sk.stuba.fei.uim.oop;


import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x=6;
        int[] pole=new int[]{1,2,3,4};
        System.out.println(x);
        testP(x);
        System.out.println(Arrays.toString(pole));
        testPole(pole);
        System.out.println(Arrays.toString(pole));
        System.out.println(x);
    }
    public static void testP(int p){
        p=10;
        System.out.println(p);
    }

    public static void testPole(int[] array){
        array[0]=10;
        System.out.println(Arrays.toString(array));

    }


}
