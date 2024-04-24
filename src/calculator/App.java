package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] memory = new int[10];
        int count = 0;

        Scanner sc = new Scanner(System.in);

        //while (true)이게 for(; ;)이거보다 클린 코드여서 무한루프를 사용해야하는 유지보수에는 while문이 적합함.
        while(true){
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // 첫번째 숫자 입력
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 두번째 숫자 입력

            System.out.println("사칙연산 기호를 입력하세요: ");
            String sign = "+-*/"; // 사칙연산 기호를 문자열 배열에 저장
            // String -> char 형변환하고 각 기호를 저장
            char plus = sign.charAt(0);
            char minus = sign.charAt(1);
            char multi = sign.charAt(2);
            char div = sign.charAt(3);
            char operator = sc.next().charAt(0);
            sc.nextLine();
            int result = 0; // 결과의 초기값

            //입력받은 기호에 따라서 계산
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

            //memory 배열 값에 result를 저장
            memory[count] = result;
            count++;
            //저장된 index가 마지막(9)일 때, 순차적으로 결과값을 삭제하고 마지막 index에 저장
            if(count > memory.length-1){
                for (int i = 0; i < count; i++) {
                    memory[i] = memory[i+1];
                }
                memory[memory.length-1] = result; //memory[9]에 새로운 result값 저장
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String end = sc.nextLine();
            if (end.equals("exit")) {
                break; // exit 입력 시 종료
            }
        }
    }
}