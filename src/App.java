import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // 값을 담을 변수
        int result = 0;

        // 연산 결과

        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.next();


            switch (operator) {
                case "+":
                    result = calculator.Calculator(firstNumber, secondNumber, "+");
                    calculator.setResultArr(result);
                    break;
                case "-":
                    result = calculator.Calculator(firstNumber, secondNumber, "-");
                    calculator.setResultArr(result);
                    break;
                case "*":
                    result = calculator.Calculator(firstNumber, secondNumber, "*");
                    calculator.setResultArr(result);
                    break;
                case "/":
                    result = calculator.Calculator(firstNumber, secondNumber, "/");
                    calculator.setResultArr(result);
                    break;
            }
            System.out.println("결과: " + calculator.getResultArr());

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제 N 입력 시 진행)");
            String answer = sc.next();
            calculator.removeResult(answer);

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회 N 입력 시 진행)");
            answer = sc.next();
            calculator.inquiryResults(answer);

            System.out.println("더 계산하시겠습니까?(exit 입력 시 종료) Y/exit");
            answer = sc.next();
            if (answer.equals("Y")) {
                continue;
            } else if (answer.equals("exit")) {
                return;
            }

        }

    }
}
