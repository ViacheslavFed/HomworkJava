package org.example;

import java.util.Scanner;

public class NewLesson {

    static double num() {
        return 1.5567 - 2 + 3;
    }

    static int num1() {
        return 10 + 10;
    }

    static float num3() {
        return 10.5f * 11.7f;
    }

    static double num4 = 55;

    static int num5(int a, int b) {
        return a + b;
    }

    static double num6(double a, double b, double c) {
        return a * b - c ;
    }

    static Scanner scanner = new Scanner(System.in);
    static int num7(int a, int b) {
        return a + b;
    }

    static double num8(double a, double b,double c){
        return a * b / c;
    }

    static int num9(int a){
        return a/2;
    }

    static double num10(double a,double b){
        System.out.println(a + b);
        return a;
    }

    static float num11(float a, float b){
        return (2*5)%3;
    }

    static int num12(){
        return 10 + 5;
    }

    static int num13(){
        return 10 + 5;
    }

    static double num14(double a){
        return a;
    }

    static double num15(double b){
        return b;
    }

    public static void main(String[] args) {
        int a = 12 - 17 + num1();
        double b = 15 * num1() + num4();
        double c = a * num1() + num1() + num();
        float d = 15 + num3();
        double f = a + b + c + d;
        double g = num5(10, 110) + num6(25,41,34);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        System.out.println(num5(10, 110));
        System.out.println(num6(25, 41, 34));
        System.out.println(g);
        System.out.println(num7(scanner.nextInt(),scanner.nextInt()));
        System.out.println(num8(43,34,2));
        System.out.println(num9(scanner.nextInt()));
        num10(scanner.nextDouble(),scanner.nextDouble());
        System.out.println(num11((float) a, (float) b));
        System.out.println(num12()*(num13()));
        System.out.println(num14(5)+(num15(5)));
    }

    private static double num4() {
        return 55;
    }
}
