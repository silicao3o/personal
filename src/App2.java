import java.util.Scanner;

public class App2{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // 첫번째 숫자 입력
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 두번째 숫자 입력

            if(num1 >= 0 && num2 >= 0){
                System.out.println("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);
                int result = 0;
                    if (operator == '+'){
                        result = num1 + num2;
                    }
                    else if (operator == '-'){
                        result = num1 - num2;
                    }
                    else if (operator == '*'){
                        result = num1 * num2;
                    }
                    else if (operator == '/'){
                        result = num1 / num2;
                    }
                System.out.println("결과: " + result);
            }

        }
}
