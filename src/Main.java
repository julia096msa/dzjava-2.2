public class Main {
    public static void main(String[] args) {

        int balance = 300; //начальный счёт
        int refill = 1100; //сумма пополнения
        int bonus =1;

        if (refill >= 1000) {
            System.out.println("Ваш баланс:" + (balance + refill + (refill / 100 * bonus)) + "руб.");
        } else {
            System.out.println("Ваш баланс:" + (balance + refill) + + "руб.");
            }
        }








    }


}
