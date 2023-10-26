package chap04;

public class _11_Continue {
    public static void main(String[] args) {

        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            if (i == noShow) {
                System.out.println(i + "번 손님, 자리에 안 계시면 다음 손님에게 판매하겠습니다.");
                continue;
            }

            sold++; // 판매수량 집계
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("--------");

        // while
        sold = 0;
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index == noShow) {
                System.out.println(index + "번 손님, 자리에 안 계시면 다음 손님에게 판매하겠습니다.");
                index++;
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
