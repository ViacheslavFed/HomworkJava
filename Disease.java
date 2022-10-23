package test;

import java.util.Scanner;

public class Disease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какая у вас температура тела");

        byte temperature = scanner.nextByte();

        while (temperature < 35 || temperature > 42) {
            System.out.println("Введите правильное число");
            temperature = scanner.nextByte();
        }
        for (int i = 0; i < temperature; i++) {
            if (temperature == 35 || temperature == 36) {
                System.out.println("Отдохните вы устали");
                break;
            }
        }
        if (temperature == 37 || temperature == 38) {
            System.out.println("Примите лекарство");
        }
        if (temperature == 39 || temperature == 40){
            System.out.println("Вызывайте врача");
        }
        if (temperature == 41 || temperature == 42){
            System.out.println("Залезьте в холодильник");
        }
    }
}