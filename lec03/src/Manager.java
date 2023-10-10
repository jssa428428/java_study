import java.util.Scanner;

class Circle{
    private int x,y,z;
    public Circle(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public void show(){
        System.out.println("x * y * z = "+x*y*z);
    }
}

public class Manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3];
        for(int i = 0; i < c.length; i++){
            System.out.print("Input x, y, z >>");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            c[i] = new Circle(x,y,z);
        }
        for(int j = 0; j < c.length; j++){
            c[j].show();
        }
        scanner.close();
    }
}
