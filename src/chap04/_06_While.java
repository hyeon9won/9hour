package chap04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        int distance = 25;
        int move = 0; // 현재 이동 거리 - 25m까지 증가하도록
        while (move < distance) {
            System.out.println("계속 이동합니다.");
            System.out.println("현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");
    }
}
