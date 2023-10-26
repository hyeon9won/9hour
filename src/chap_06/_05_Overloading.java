package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number; 로 써도 됨
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩: 이름이 같은 메소드를 여러 개 만드는 것
        // 전달값의 타입이 다를 때
        // 또는 전달값의 개수가 다를 때
        System.out.println(getPower(3));
        System.out.println(getPower("3"));
        System.out.println(getPower(3,3));
        // 반환값의 타입이 다를 때에는 오버로딩 불가능!
    }
}
