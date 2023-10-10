import java.util.Scanner;

public class FindMid {
    public static void compare(int a, int b, int c){
        if(((a <= b) && (a >= c)) || ((a <= c) && (a >= b))) System.out.println("중간값은 "+a+"입니다.");
        else if(((b <= a) && (b >= c)) || ((b <= c) && (b >= a))) System.out.println("중간값은 "+b+"입니다.");
        else if(((c <= a) && (c >= b)) || ((c <= b) && (c >= a))) System.out.println("중간값은 "+c+"입니다.");
        else System.out.println("중간값이 없습니다.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("3개의 정수를 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        compare(a,b,c);
        scanner.close();
    }
}
