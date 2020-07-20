public class Main {
     public static void main(String[] args) {
        int originbalance = 100;
        int incomingbalance = 1299;
        double bonus = 0;
        if (incomingbalance >= 1100) {
            bonus = Math.floor(incomingbalance / 100);
        }

         System.out.println("Итоговая сумма " + (originbalance + incomingbalance + bonus));
         System.out.println("Сумма бонуса " + bonus);
    }
}
