package chap04;

public class _02_else {
    public static void main(String[] args) {
        int hour = 10;
        if (hour < 14) {
            System.out.println("아메리카노 1잔");
        } else {
            System.out.println("아메리카노(디카페인) 1잔");
        }
        System.out.println("주문이 완료되었습니다.");

        hour = 10;
        boolean morningCoffee = true;
        if (hour >= 14 || morningCoffee) {
            System.out.println("아메리카노(디카페인) 1잔");
        } else {
            System.out.println("아메리카노 1잔");
        }
        System.out.println("두 번째 주문이 완료되었습니다.");
    }
}
