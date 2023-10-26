package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드: 기관 ANSI에서 제안한 미국 표준 코드
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c); // 아스키코드가 출력됨

        c++; // A 다음의 알파벳이 출
        // 력됨을 예상할 수 있음
        System.out.println(c);
        System.out.println((int)c);

        // 숫자(0)는 48부터 시작
        // 대문자(A)는 65부터
        // 소문자(a)는 48부터

        // 세로 10 X 가로 15에 해당하는 좌석 배열
        String[][] seats3 = new String[10][15]; // {}안에 값을 넣지 않고 선언만 할 때는 중괄호 안에 크기 설정해주기
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {                //세로
            for (int j = 0; j < seats3[i].length; j++) {         //가로
                // String.valueOf(); 기능을 통해 ch를 String(문자열)으로 변경
                // char ch = 'A'의 값은 65이기 때문에 문자열로 바꿔주는 것
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.println(seats3[i][j] + " ");

            }
            System.out.println();
        }
    }
}
