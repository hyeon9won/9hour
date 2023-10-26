package chap04;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 주차 요금 시간 당 4000
        // 최대 요금은 30000
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        int hour = 5;
        boolean smallCar = true; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 탑승 여부

        int fee = hour * 4000; // 시간 당 주차 요금 계산

        // 최대 요금
        if (fee > 30000) {
            fee = 30000;
        }

        // 할인
        if (smallCar || withDisabledPerson) {
            fee /= 2; // 50%
        }
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}