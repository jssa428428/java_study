class Money{
    static int money = 0;
    void calculate_money(int deposit, int withdraw) {
        money = money + deposit - withdraw;
        if(money < 0) System.out.println("잔액이 부족하여 출금할 수 없습니다.");
        else System.out.println("잔액은 "+money+"입니다.");
    }
}

public class SharingWallet {
    public static void main(String[] args) {
        Money s1 = new Money();
        s1.calculate_money(100, 900);
        s1.calculate_money(10000, 2890);
    }
}
