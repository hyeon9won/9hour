package chap04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // 석차에 따른 장학금 지급
        // 1등: 전액 장학금
        // 2등: 반액 장학금
        // 3등: 반액 장학금
        // 그 외: 장학금 대상 아님

        // if else문을 이용한 방법
        int ranking = 7;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if ( ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상이 아닙니다.");
        }
        System.out.println("조회 완료");

        // switch case문을 이용한 방법
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상이 아닙니다.");
        }
        System.out.println("조회 완료 #2");

        // 중고 거래 시 상품 등급별 가격 책정(1등급: 최상, 4등급: 최하)
        int grade = 1; // 등급
        int price = 7000; // 기본 가격
        switch (grade) {
            case 1:
                price += 1000; // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격은 " + price + "원 입니다.");

    }
}
