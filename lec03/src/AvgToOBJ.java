import java.util.Scanner;

class Score{
    int math;
    int science;
    int english;
    public Score(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }
    public double getAvg(){
        return (math+science+english) / 3;
    }
}

public class AvgToOBJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Score s = new Score(math, science, english);
        System.out.println("평균은 "+s.getAvg());
        scanner.close();
    }
}
