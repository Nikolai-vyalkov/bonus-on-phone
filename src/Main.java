public class Main{
    public static void main(String[] args) {
        boolean balance = true;
        int percent;
        if (balance) {
        percent = 1;
        } else {
            percent = 0;
        }
        int amout = 1200;
        long bonus = (amout * percent) / 100;
        System.out.print(bonus);

    }
}
