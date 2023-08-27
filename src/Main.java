public class Main {
    public static void main(String[] args) {

        int account = 100;
        int amount = 1100;

        int bonus = amount >= 1000 ? amount / 100 : 0;
        account += amount + bonus;

        System.out.println("Итоговая сумма на счёте: " + account);
        System.out.println("Бонусные рубли: " + bonus);

    }
}