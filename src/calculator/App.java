package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CircleCalculator calc = new CircleCalculator();
        ArithmeticCalculator calc2 = new ArithmeticCalculator();
        Scanner sc = new Scanner(System.in);

        while(true){
            //사칙연산 or 원의 넓이
            System.out.println("원의 넓이 혹은 사칙연산 중 어느 것을 계산할 것인지 적으세요.");
            String choice = sc.nextLine();
            if(choice.equals("circle")){
                System.out.println("반지름을 입력하세요: ");
                int radius = sc.nextInt(); // 원의 반지름 입력
                double resultCircle = calc.calculateCircleArea(radius);
                System.out.println("결과: " + resultCircle);

                ArrayList<Double> circleStorage = calc.getWidthCircle();
                circleStorage.add(resultCircle);
                calc.setWidthCircle(circleStorage);
                calc.inquiryCircle();
            }
            else {
                System.out.println("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt(); // 첫번째 숫자 입력
                System.out.println("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt(); // 두번째 숫자 입력

                System.out.println("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);
                sc.nextLine();

                double result1 = calc2.calculate(num1, num2, operator);
                System.out.println("결과: " + result1);
                ArrayList<Double> storage = calc2.getMemory();
                storage.add(result1);
                calc2.setMemory(storage);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String notRemove = sc.nextLine();
                if(notRemove.equals("remove")){
                    calc2.removeResult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquiry = sc.nextLine();
                if(inquiry.equals("inquiry")){
                    calc2.inquiryResults();
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String end = sc.nextLine();
            sc.nextLine();
            if (end.equals("exit")) {
                break; // exit 입력 시 종료
            }
        }
    }
}