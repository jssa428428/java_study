import java.util.Scanner;

class MyCircle{
    double radius;
    public MyCircle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
public class CircleOBJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("반지름 입력>>");
        double radius = scanner.nextDouble();
        MyCircle c1 = new MyCircle(radius);
        System.out.printf("반지름 %.2f인 원의 면적: %.2f\n", c1.radius, c1.getArea());
        scanner.close();
    }
}
