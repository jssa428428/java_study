public class StringToInt {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            try{
                int n = Integer.parseInt(args[i]);
                sum += n;
            }
            catch (NumberFormatException e){
                System.out.println(args[i]+"는 정수가 아닙니다.");
            }
        }
        System.out.println(sum);
    }
}