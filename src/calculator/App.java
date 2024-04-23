package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
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
            char operator = sc.next().charAt(0);
            sc.nextLine();
            int result = 0;

            //특정 문자열을 받았을 때 반복문 종료 그 전까지는 반복문을 이용한 계산

            if (operator == plus) {
                result = num1 + num2;
            } else if (operator == minus) {
                result = num1 - num2;
            } else if (operator == multi) {
                result = num1 * num2;
            } else if (operator == div) {
                result = num1 / num2;
            }
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String end = sc.nextLine();
            if(end.equals("exit")) {
               break;
            }
        }
    }
}