public class Main {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            if ((i % 2) == 0) {
                total += 10;
            } else {
                total -= 5;
            }
        }

        System.out.println(total);
    }
}
