import java.util.Scanner;

public class EqualNum {
    public static void is_equal(int n){
        if(n < 10 || n > 99) System.out.println("두 자리수가 아닙니다.");
        else {
            if ((n / 10) == (n % 10)) System.out.println("자리수가 같습니다.");
            else System.out.println("자리수가 틀립니다.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2자리수 정수 입력: ");
        int n = scanner.nextInt();
        is_equal(n);
        scanner.close();
    }
}
