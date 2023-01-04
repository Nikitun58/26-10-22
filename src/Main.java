public class Main {
    public static void main(String[] args) {


        // Задача №1
        System.out.println("Задача №1");
        int clientOS=1;
            if (clientOS==0){
                System.out.println("Установите версию приложения для iOS по ссылке");}
            else {System.out.println("Установите версию приложения для Android по ссылке");}


        // Задача №2
        System.out.println("Задача №2");
        int clientDeviceYear=2015;
        if (clientOS==0) {
            if (clientDeviceYear>=2015){
            System.out.printf("приложение будет работать корректно для iOS");}
            else{
            System.out.println("Установите облегченную версию приложения для iOS по ссылке"); }}
        else if (clientDeviceYear>=2015){
            System.out.println("приложение будет работать корректно для Android");}
        else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");}

        // Задача №3
        System.out.println("Задача №3");
        int year=2024;
        if (year % 4 ==0 && year % 100 !=0 || year % 400 ==0){
            System.out.println(year + " год является високосным");}
        else {
            System.out.println("год не является високосным");}

        // Задача №4
        System.out.println("Задача №4");
        int deliveryDistance = 95;
        int daysdelivery=1;
        if (deliveryDistance>20){daysdelivery++;}
        if (deliveryDistance>60){daysdelivery++;}
            System.out.println("Потребуется дней "+daysdelivery);

        // Задача №4
        System.out.println("Задача №4");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Сезон зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осень");
                break;
            default:
                System.out.println("Такого сезона не существует");

        }
    }
}