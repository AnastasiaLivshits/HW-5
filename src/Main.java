public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int clientOs = 1;

        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
            }else {
            System.out.println("Неверное значение!");}
        {System.out.println();}
        {System.out.println("Task2");
        int clientDeviceYear = 2014; {
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию iOs по ссылке.");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию iOs по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию Android по ссылке");
        } else if (clientOs==1 && clientDeviceYear>=2015){
            System.out.println("Установите обычную версию Android по ссылке");
        } else System.out.println("Неверное значение!");}
            {System.out.println();}
        System.out.println("Task3");
        int year = 2000;
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0) || (year%2000==0)) {
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
        int monthNumber = 13;
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                    {
                        System.out.println("месяц зимы");}
                    break;
                    case 3:
                    case 4:
                    case 5:
                    {
                        System.out.println("месяц весны");}
                    break;
                    case 6:
                    case 7:
                    case 8:
                    {
                        System.out.println("месяц лета");}
                    break;
                    case 9:
                    case 10:
                    case 11: {
                        System.out.println("месяц осени");
                        break;}
                    default:
                            System.out.println("Unexpected value");

                    }}}};