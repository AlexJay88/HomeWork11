public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {
        System.out.println("Задача 1");

        int year = 2024;

        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {

            findTheYear(year);
        } else {
            findTheYearTwo(year);
        }
    }


    public static void findTheYear(int determineTheYear) {
        System.out.println("«" + determineTheYear + " год — невисокосный год»");
    }

    public static void findTheYearTwo(int determineTheYearTwo) {
        System.out.println("«" + determineTheYearTwo + " год — високосный год»");
    }



    public static void task2() {
        System.out.println("Задача 2");


        int clientOS = 1;
        int clientDeviceYear = 2012;

        if (clientOS == 0 && clientDeviceYear > 2015)
            printIOS();

        if (clientOS == 0 && clientDeviceYear < 2015)
            printIOSTwo();

        if (clientOS == 1 && clientDeviceYear > 2015)
            printAndroid();

        if (clientOS == 1 && clientDeviceYear < 2015)
            printAndroidTwo();
    }

    public static void printIOS() {
        System.out.println("«Установите  версию приложения для iOS по ссылке»");
    }

    public static void printIOSTwo() {
        System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
    }

    public static void printAndroid() {
        System.out.println("«Установите версию  для Android по ссылке»");
    }


    public static void printAndroidTwo() {
        System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
    }



    public static void printOne() {
        System.out.print(" доставка занимает 1 день,расстояние (км):");
    }

    public static void printTwo() {
        System.out.print("доставка занимает 2 дня ,расстояние (км):");
    }

    public static void printThree() {
        System.out.print("доставка занимает 3 дня,расстояние(км):");
    }

    public static void printFour() {
        System.out.print("нет доставки,расстояние(км):");
    }





    public static int  searchDistance(int deliveryDistance) {
        return deliveryDistance;}


        public static void task3 () {
            System.out.println("Задача 3");

            int deliveryDistance =10;

            if (deliveryDistance > 0 && deliveryDistance < 20)
                printOne();
            if (deliveryDistance >= 20 && deliveryDistance < 60)
                printTwo();

            if (deliveryDistance >= 60 && deliveryDistance < 100)
                printThree();

            if (deliveryDistance >= 100)
                printFour();

              int printDistance = searchDistance(deliveryDistance);
              System.out.println(printDistance);}}













































































