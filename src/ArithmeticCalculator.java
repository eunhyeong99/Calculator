import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator{

    public int calculate(int firstNum, int secondNum, String operator) {

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

    public ArrayList<Integer> getResultArr() {
        return super.resultArr;
    }

    public void setResultArr(int result) {
        super.resultArr.add(result);
    }

    public void removeResult(String message) {
        if (message.equals("remove")) {
            super.resultArr.remove(0);
        }
    }

    public void inquiryResults(String message) {
        if (message.equals("inquiry")) {
            System.out.println(super.resultArr);
        }
    }

}
