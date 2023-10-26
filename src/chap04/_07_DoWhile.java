package chap04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // While
        int distance = 25; // 전체 거리
        int move = 0; // 현재 이동 거리
        int height = 2; // 신장
        while (move + height <distance) {
            System.out.println("계속 이동합니다.");
            System.out.println("현재 이동 거리는 " + move);
            move += 3;
        }
        System.out.println("도착");
        System.out.println();

        //DoWhile
        do {
            System.out.println("계속 이동합니다.");
            System.out.println("현재 이동 거리는 " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");
    }
}
