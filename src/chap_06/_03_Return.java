package chap_06;

public class _03_Return {
    // 호텔 연락처
    public static String getPhoneNumber() { // void는 반환값이 없음을 의미함으로 변수형태를 입력해줘야함
        String phoneNumber = "02-1234-1234";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getAddress() {
        return "서울시 도봉구 어쩌구로 40";
    }

    // 호텔 이용 시설
    public static String getActivities () {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환값
        // #1
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호: " + contactNumber);
        System.out.println();
        // #2
        String visitAddress = getAddress();
        System.out.println("호텔 주소: " + visitAddress);
        System.out.println();
        // #3
        System.out.println("호텔 액티비티: " + getActivities());
    }
}
