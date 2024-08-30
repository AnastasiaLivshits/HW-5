public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    {
        {
            System.out.println("Task2");
            int clientIos = 0;
            int clientAndroid= 1;//0 для iOS, 1 для Android
            int clientDeviceYear = 2013;

            if (clientDeviceYear<2015 && clientAndroid==1) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            }else if (clientDeviceYear>= 2015) {
                System.out.println("E");
            }else if (clientDeviceYear<2015 && clientIos==0){
                System.out.println("T");}
            else {
                System.out.println("RR");}}}}



