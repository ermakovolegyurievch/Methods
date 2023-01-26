import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        checkLeapYear(2024);
    }

    public static void checkLeapYear(int i) {
        if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
            System.out.println(i + " год является високосным.");
        } else {
            System.out.println(i + " год не является високосным.");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        chooseSystemToSetup("Android", 2020);
    }

    public static void chooseSystemToSetup(String clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS.equals("iOS") && clientDeviceYear < currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS.equals("iOS") && clientDeviceYear == currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS.equals("Android") && clientDeviceYear < currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }


    public static void task3() {
        System.out.println("Задача 3");
        deliveryTimeCalculation(65);
    }

    public static void deliveryTimeCalculation(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется день:" + day);
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дня:" + (day + 1));
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дня:" + (day + 2));
        } else {
            System.out.println("Доставки нет.");
        }
    }
}

