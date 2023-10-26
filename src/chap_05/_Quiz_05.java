package chap_05;
// 쇼핑몰에서 구매 가능한 신발 사이즈 옵션 출력
// 250부터 295까지 5단위로 증가
// 신발 사이즈 수는 총 10가지: 250 255 260 265 270 275 280 285 290 295

public class _Quiz_05 {
    public static void main(String[] args) {
        System.out.println("현재 구매 가능한 신발 사이즈를 보여드립니다.");
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + 5 * i;
            }
        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}