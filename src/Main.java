import org.w3c.dom.CDATASection;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            month++;
            total = total + salary;
            total = total + total / 100;
            System.out.println("месяц " + month + ", сумма " + total);
        }
        System.out.println("Количество месяцев " + month + ", сумма " + total);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i <= 9) {
            i++;
            System.out.printf(" " + i);
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.printf(" " + j);

        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int people = 12_000_000;
        int incr = people / 1000 * 17;
        int decr = people / 1000 * 8;
        for (int year = 1; year <= 10; year++) {
            people = people + incr - decr;
            System.out.println("Год " + year + " численность " + people);
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        float total = 15000;
        int finish = 12_000_000;
        int month = 0;
        int percent = 7 / 12;
        while (total < finish) {
            // total =  (total / 100 * percent);
            total = total + (total / 100 * 7 / 12);
            month++;
            System.out.println("сумма накоплений " + total + "будет достигнута через " + month + " месяцев");
        }
        System.out.println(month / 12 + "лет");
    }

    public static void task5() {
        System.out.println("Задача 5");
        float total = 15000;
        int finish = 12_000_000;
        int month = 0;
        int percent = 7 / 12;
        while (total < finish) {
            // total =  (total / 100 * percent);
            total = total + (total / 100 * 7 / 12);
            month++;
            if (month % 6 == 0) {
                System.out.println("сумма накоплений " + total + "будет достигнута через " + month + " месяцев");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        float total = 15000;
        int month = 0;
        int allYear = 9 * 12;
        //int percent = 7/12;
        while (month < allYear) {
            total = total + (total / 100 * 7 / 12);
            month++;
            if (month % 6 == 0) {
                System.out.println("сумма накоплений за " + month + " месяцев составит " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int oneFriday = 1;
        while (oneFriday <= 31) {
            System.out.println("Сегодня пятница " + oneFriday + " число");
            oneFriday = oneFriday + 7;
        }

    }
    public static void task8() {
        System.out.println("Задача 8");

        for (int i = 1822; i < 2122; i++) {
            if (i % 79==0) {

               System.out.println("Комета пролетит в " + i + " году");

            }
        }

    }
}