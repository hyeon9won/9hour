package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열의 순회
        // 3 x 5 크기의 이차원 배열
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // for문을 겹쳐서 사용
        for (int i = 0; i < 3; i++) {               //세로
            for (int j = 0; j < 5; j++) {           //가로
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");

        // 일정하지 않은 배열
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // for문의 조건식에 정확한 숫자를 적지 않고, length를 활용하여
        for (int i = 0; i < seats2.length; i++) {               //세로
            for (int j = 0; j < seats2[i].length; j++) {          //가로
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        // 세로 10 X 가로 15에 해당하는 좌석 배열
        String[][] seats3 = new String[10][15]; // {}안에 값을 넣지 않고 선언만 할 때는 중괄호 안에 크기 설정해주기
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats3.length; i++) {                //세로
            for (int j = 0; j < seats3[i].length; j++) {         //가로
                seats3[i][j] = eng[i] + (j + 1);
            }
        }

        // 표가 예매된 경우
        seats3[7][8] = "__";
        seats3[7][9] = "___";

        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) {               //세로
            for (int j = 0; j < seats3[i].length; j++) {         //가로
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}