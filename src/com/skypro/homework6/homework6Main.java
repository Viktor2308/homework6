package com.skypro.homework6;

public class homework6Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();




    }
    public static void task1(){
        System.out.println("Task 1");
        for(int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
    public static void task2(){
        System.out.println("\nTask 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
    public static void task3(){
        System.out.println("\nTask 3");
        for (int i = 0; i <= 17; i = i +2 ) {
            System.out.println(i);
        }
    }
    public static void task4(){
        System.out.println("\nTask 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
    public static void task5(){
        System.out.println("\nTask 5");
        for (int i = 1904; i<=2096; i = i + 4){
            System.out.println(i + " the year is a leap year");
        }
    }
    public static void task6(){
        System.out.println("\nTask 6");
        for (int i = 7; i <=98; i = i + 7){
            System.out.println(i);
        }
    }
    public static void task7(){
        System.out.println("\nTask 7");
        for (int i = 1; i<=512; i = i*2){
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("\nTask 8");
        int money = 29000;
        int total = 0;
        for (int i = 1; i<=12; i++ ){
            total += money;
            System.out.println("In " + i + " month, saved up money " + total + " rub.");
        }
    }
    public static void task9() {
        System.out.println("\nTask 9");
        int money = 29000;
        int total = 0;
        for (int i = 1; i<=12; i++ ){
            total = total + total/100;
            total += money;
            System.out.println("In " + i + " month, money in bank " + total + " rub.");
        }
    }
    public static void task10() {
        System.out.println("\nTask 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*"+i+"="+(2*i));
        }
    }


}
