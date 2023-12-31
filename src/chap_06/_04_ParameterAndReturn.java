package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number; 로 써도 됨
    }
    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 전달값과 반환값이 함께 있는 메소드
        int retVal = getPower(2); // 2 * 2 = 4, 반환값을 받기 위한 변수 정의가 필요해서 int retVal이 붙는 것
        System.out.println(retVal);

        retVal = getPower(3);
        System.out.println(retVal);

        retVal = getPowerByExp(3, 4);
        System.out.println(retVal);
    }
}
