package com.company;
import java.util.Scanner;
public class Main {
    private static final double sweetener=0.03;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double killMouse = scanner.nextDouble();
        double weightMouse = scanner.nextDouble();
        double weightHuman = scanner.nextDouble();
        System.out.printf("%.1f",((weightHuman/weightMouse)*killMouse)/sweetener);
    }
}
