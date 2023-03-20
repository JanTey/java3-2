public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 1_500;
        int x = 100;
        int present = 1;
        int totAccount;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / x;
            totAccount = account + refill + bonus;
        } else {
            totAccount = account + refill;
            bonus = 0;
        }
        System.out.println("Итого, на счету: " + totAccount + ". Количество бонусных рублей: " + bonus);
    }
}
