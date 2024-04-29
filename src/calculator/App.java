package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(new ArrayList<Integer>());

        Scanner sc = new Scanner(System.in);

        //while (true)이게 for(; ;)이거보다 클린 코드여서 무한루프를 사용해야하는 유지보수에는 while문이 적합함.
        while(true){
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // 첫번째 숫자 입력
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 두번째 숫자 입력

            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            sc.nextLine();

            int result1 = calculator.calculate(num1, num2, operator);

            System.out.println("결과: " + result1);
            ArrayList<Integer> storage = calculator.getMemory();
            storage.add(result1);
            calculator.setMemory(storage);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String notRemove = sc.nextLine();
            if(notRemove.equals("remove")){
                calculator.removeResult();
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.nextLine();
            if(inquiry.equals("inquiry")){
                calculator.inquiryResults();
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String end = sc.nextLine();
            if (end.equals("exit")) {
                break; // exit 입력 시 종료
            }
        }
    }
}