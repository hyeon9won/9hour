package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열: 이차원 배열
        // 좌석 (A1~5 / B1~5 / C1~5)

        // 일차원 배열 선언 방법 String[] 변수명 = new String[] {값, 값, 값};
        // 이차원 배열 선언 방법 String[][] 변수명 = new String[][] {값, 값, 값};
        // new String은 생략가능


        // 3 x 5 크기의 이차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // 특정 좌석에 접근하는 방법: ex) A3
        System.out.println(seats[0][2]); // 세로, 가로 순서로 좌표 찍기

        // 모든 행이 같은 값을 가지지 않는 경우의 다차원 배열
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // 값이 없는 좌석에 접근하는 경우? ex) A5로 추정되는 자리
        // System.out.println(seats2[0][4]); -> Index 4 out of bounds for length 3 오류 발생

        // 삼차원 배열 강의 패스했음.
    }
}
