import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt(); // 첫번째 숫자 입력
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt(); // 두번째 숫자 입력

        System.out.println("사칙연산 기호를 입력하세요: ");
        String sign = "+-*/";
        char plus = sign.charAt(0);
        char minus = sign.charAt(1);
        char multi = sign.charAt(2);
        char div = sign.charAt(3);

    }
}