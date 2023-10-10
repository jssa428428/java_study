import java.util.Scanner;

public class ExchangeRate {
    public static double Exchange(double e, int w){
        return w/e;
    }
    public static void main(String[] args) {
        final double exchange = 1333;
        Scanner scanner = new Scanner(System.in);
        int won = scanner.nextInt();
        System.out.println(Exchange(exchange, won)+"달러");
        scanner.close();
    }
}
