import java.util.Scanner;

public class ScannerSum {
    public static int sum(int m, int n){
        return m + n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sum(a,b));
        scanner.close();
    }
}
