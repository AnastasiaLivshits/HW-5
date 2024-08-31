public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int clientOs = 0;
        if (clientOs == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else
            System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println("Task2");
        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию iOs по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию iOs по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию Android по ссылке");
        } else {
            System.out.println("Установите обычную версию Android по ссылке");
        }
        System.out.println("Task3");
        int year = 1584;
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0)) {
            ;
            System.out.println(year + "Год является високосным");
        } else {
            System.out.println(year + "Год не является високосным");
        }
        System.out.println("Task4");
        int distance = 120;
        if (distance <= 20) {
            System.out.println("если расстояние равно " + distance + " км, доставка занимает сутки");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("если расстояние равно " + distance + " км, доставка занимает 2 дня");
        } else if (distance <= 100 && distance > 60) {
            System.out.println("если расстояние равно " + distance + " км, доставка занимает 3 дня");
        } else {
            System.out.println("доставки нет");
        }
        System.out.println("Task5");
        char monthNumber = 4;
                switch (monthNumber) {
            case 1:
                System.out.println("Январь - месяц зимы");
                break;
            case 2:
                System.out.println("Февраль - месяц зимы");
                break;
            case 3:
                System.out.println("Март - месяц весны");
                break;
            case 4:
                System.out.println("Апрель - месяц весны");
                break;
            case 5:
                System.out.println("Май - месяц весны");
                break;
            case 6:
                System.out.println("Июнь - месяц лета");
                break;
            case 7:
                System.out.println("Июль - месяц лета");
                break;
            case 8:
                System.out.println("Август - месяц лета");
                break;
            case 9:
                System.out.println("Сентябрь - месяц осени");
                break;
            case 10:
                System.out.println("Октябрь - месяц осени");
                break;
            case 11:
                System.out.println("Ноябрь - месяц осени");
                break;
            case 12:
                System.out.println("Декабрь - месяц зимы");
                break;
            default:
                System.out.println("Unexpected value");
        }
    }};

