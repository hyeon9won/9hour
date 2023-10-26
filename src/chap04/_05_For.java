package chap04;

public class _05_For {
    public static void main(String[] args) {
        // 반목문 For
        // for(선언; 조건; 증감) {}
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 반갑습니다. " + i);
        }

        // 짝수만 출령하는 for문
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }
        System.out.println();
        // 홀수만
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println();
        // 숫자 역순 출력
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
        // 1부터 10까지 수들의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재 합계 " + sum);
        }
        System.out.println("총합 " + sum + "입니다.");
    }
}
