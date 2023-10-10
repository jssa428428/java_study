import java.util.Scanner;

public class MakeTriangle {
    public static void is_possible(int a, int b, int c){
        if(((a + b) < c) || ((a + c) < b) || ((b + c) < a)) System.out.println("삼각형이 불가능합니다.");
        else System.out.println("삼각형이 가능합니다.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("세 변을 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        is_possible(a,b,c);
        scanner.close();
    }
}
