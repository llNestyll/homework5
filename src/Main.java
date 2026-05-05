//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        }

        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }







        int clientsOS = 0;
        int clientDeviceYear = 2013;
        if (clientsOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientsOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientsOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        }
        else  {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }





        int year = 2023;
        if (year > 1584 && ((year% 400 ==0) || (year% 4 == 0 && year % 100 != 0))){
            System.out.println(year + " год является високосным");
        }
        else if (year > 1585){
            System.out.println(year + " год не является високосным");
        }
        else {
            System.out.println("год не может быть меньше 1585");
        }




        int deliveryDistance = 54;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней "+deliveryDays);
        }
        else if (deliveryDistance > 20 && deliveryDistance <=60){
            System.out.println("Потребуется дней "+(deliveryDays+1));
        }
        else if (deliveryDistance > 60 && deliveryDistance <=100){
            System.out.println("Потребуется дней "+(deliveryDays+2));
        }
        else {
            System.out.println("доставки нет");
        }






        char monthNumber = 11;
        if (monthNumber > 12) {
            System.out.println("Ошибка: некорректный номер месяца");
            return;
        }
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("этот месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("этот месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("этот месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("этот месяц принадлежит к сезону осень");
                break;
        }

















    }
}