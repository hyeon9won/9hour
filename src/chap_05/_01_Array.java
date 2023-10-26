package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String Ross = "아메리카노";
        String Rachel = "카페모카";
        String Chandler = "라테";
        String Monica = "카푸치노";

        // 배열 선언 
        String[] coffee = new String[4]; // 크기 4의 String 배열 #1
        String coffeeOrder[] = new String[4]; // 위 배열의 다른 형태 #2
        
        // #1 & #2
        coffee[0] = "아메리카노";
        coffee[1] = "카페모카";
        coffee[2] = "라테";
        coffee[3] = "카푸치노";

        // #3 배열을 선언함과 동시에 인덱스
        String[] orderCoffee = new String[] {"아메리카노", "카페모카", "라테", "카푸치노"};

        // #4
        String[] myCoffee = {"아메리카노", "카페모카", "라테", "카푸치노"};

        // coffee order
        System.out.println(myCoffee[0] + " 하나");
        System.out.println(myCoffee[1] + " 하나");
        System.out.println(myCoffee[2] + " 하나");
        System.out.println(myCoffee[3] + " 하나");

        System.out.println("------------");

        // for 반복문을 통한 출력
        for (int i = 0; i < 4; i++) {
            System.out.println(myCoffee[i] + " 하나");
        }
        System.out.println("주세요.");

        System.out.println("---------------");

        // 배열의 길이 length를 이용한 순회
        for (int i = 0; i < myCoffee.length; i++) {
            System.out.println(myCoffee[i] + " 하나");
        }
        System.out.println("주세요.");
        
        // enhanced for: for-each 반복문 / 향상된 for문
        for (String coffees : myCoffee) {
            System.out.println(coffees + " 하나");
        }
        System.out.println("주세요");

        // for each와 for i 차이점
        // for i: 인덱스의 값을 이용해야 하는 경우 | ex) i값을 3으로 설정하면 3명까지만 커피 주문
        // for each: 배열의 모든 요소를 순회하는 경우
    }
}
