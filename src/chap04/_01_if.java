package chap04;

import org.w3c.dom.ls.LSOutput;

public class _01_if {
    public static void main(String[] args) {
        int hour = 15;
        if (hour < 14) {
            System.out.println("아메리카노 1잔");
            System.out.println("샷 추가");
        }
        System.out.println("주문이 완료되었습니다.");

        // 오후 2시 이전 + 모닝 커피를 마시지 않은 경우만 주문
        hour = 10;
        boolean morningCoffee = false; // 모닝 커피
        // ** if (hour < 14 && !morningCoffee) ** 로도 표현 가능
        if (hour < 14 && morningCoffee == false) {
            System.out.println("아메리카노 1잔");
        }
        System.out.println("주문이 완료되었습니다.");

        // 오후 2시 이후 + 모닝 커피를 마신 경우 디카페인 커피 주문
        hour = 15;
        morningCoffee = true;
        if (hour >= 14 && morningCoffee)    {
        // ** if (hour >= 14 && morningCoffee == true) ** 로도 표현 가능
            System.out.println("아메리카노(디카페인) 1잔");
        }
        System.out.println("주문이 완료되었습니다.");
    }
}
