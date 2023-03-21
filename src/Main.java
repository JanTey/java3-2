public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 1_500;
        int base = 100;
        int present = 1;
        int totAccount;
        int bonus;
        if (refill > 1000) {
            bonus = refill / base;
            totAccount = account + refill + bonus;
        } else {
            totAccount = account + refill;
            bonus = 0;
        }
        System.out.println("Итого, на счету: " + totAccount + ". Количество бонусных рублей: " + bonus);
    }
}
