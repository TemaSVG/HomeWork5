public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 2
        int clientDeviceYear = 2013;
        if (clientDeviceYear < 2015) {
            System.out.printf("Установите облегченную версию приложения для %s по ссылке\n", (clientOS == 0 ? "IOS" : "Android"));
        } else {
            System.out.printf("Установите обычную версию приложения для %s по ссылке\n", (clientOS == 0 ? "IOS" : "Android"));
        }
        //Задание 3
        int year = 1603;
        if ((year > 1584) && (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.printf(year + " год является високосным\n");
        } else System.out.printf(year + " год не является високосным\n");
        //Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.printf("Потребуется дней: 1\n");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.printf("Потребуется дней: 2\n");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.printf("Потребуется дней: 3\n");
        } else System.out.printf("Доставки нет\n");
        //Задание 5
        int monthNumber = 2;
        switch (monthNumber) {
            case 1:
                System.out.printf("Январь пренадлежит к сезону зима");
                break;
            case 2:
                System.out.printf("Февраль пренадлежит к сезону зима");
                break;
            case 3:
                System.out.printf("Март пренадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель пренадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май пренадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь пренадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль пренадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август пренадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь пренадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь пренадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь пренадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь пренадлежит к сезону зима");
                break;
        }
    }
}