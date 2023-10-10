public class MakeSum {
    public static void sum_while(){
        int sum = 0, i = 0;
        while(i < 100){
            if(i % 2 == 0) {
                sum += i;
                i++;
            }
            else i++;;
        }
        System.out.println("while문: 0부터 99까지의 짝수들의 합은 "+sum);
    }
    public static void sum_do_while(){
        int sum = 0, i = 0;
        do{
            if(i % 2 == 0) {
                sum += i;
                i++;
            }
            else i++;
        } while(i < 100);
        System.out.println("do-while문: 0부터 99까지의 짝수들의 합은 "+sum);
    }
    public static void sum_for(){
        int sum = 0, i = 0;
        for(i = 0; i < 100; i++){
            if(i % 2 == 0) {
                sum += i;
            }
            else continue;
        }
        System.out.println("for문: 0부터 99까지의 짝수들의 합은 "+sum);
    }
    public static void main(String[] args) {
        sum_while();
        sum_do_while();
        sum_for();
    }
}
