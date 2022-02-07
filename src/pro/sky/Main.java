package pro.sky;

public class Main {

    public static void main(String[] args) {
        // tasks1&2

        System.out.println();
        System.out.println("Задачи 1 и 2");

        int clientOS = 0;
        int clientDeviceYear = 2018;

        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке https://");
            }
            if (clientOS == 1)
                System.out.println("Установите версию приложения для Android по ссылке https://");
        } else {
            if (clientOS == 0) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке https://");
            }
            if (clientOS == 1)
                System.out.println("Установите облегчённую версию приложения для Android по ссылке https://");
        }


        //task3

        System.out.println();
        System.out.println("Задача 3");

        int year = 2000;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }


        //task4

        System.out.println();
        System.out.println("Задача 4");

        int deliveryDistance = 95;

        if (0 < deliveryDistance && deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1.");
        } else if (20 <= deliveryDistance && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2.");
        } else if (60 <= deliveryDistance && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3.");
        } else
            System.out.println("Доставка невозможна.");


        //task5

        System.out.println();
        System.out.println("Задача 5");


        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Не на этой планете.");
        }
    }
}




