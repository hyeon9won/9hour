package chap04;

public class _03_elseif {
    public static void main(String[] args) {
        boolean hallabongAde = false;
        boolean mangoJuice = true;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 주문");
        } else if (mangoJuice) {
            System.out.println("망고 주스 주문");
        } else
            System.out.println("아메리카노 주문");
        System.out.println("음료 주문 완료");
    }
}


// If와 else if만 가지고도 동작 가능. else 없어도 동작함.