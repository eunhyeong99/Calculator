class DivisionByZeroException {
    public DivisionByZeroException(String message) {
        System.out.println(message);
    }

}

public class Calculator {


    public int Calculator(int firstNum, int secondNum, String operator) {

            int result = 0;

            switch (operator) {
                case "+":
                    result = firstNum + secondNum;
                    break;
                case "-":
                    result = firstNum - secondNum;
                    break;
                case "*":
                    result = firstNum * secondNum;
                    break;
                case "/":
                    if (secondNum == 0) {
                        new DivisionByZeroException("0으로 나눌 수 없습니다.");
                    }
                    result = firstNum / secondNum;
                    break;
            }
             return result;
        }


}

