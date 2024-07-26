import java.util.ArrayList;

class DivisionByZeroException {
    public DivisionByZeroException(String message) {
        System.out.println(message);
    }

}

public class Calculator {

    //연산결과를 저장하는 List
    private ArrayList<Integer> resultArr;
    private ArrayList<Double> circleArr;

    private static final double PI = 3.141592;


    public Calculator() {
        this.resultArr = new ArrayList<>();
        this.circleArr = new ArrayList<>();
    }

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
        return resultArr;
    }

    public void setResultArr(int result) {
        this.resultArr.add(result);
    }

    public void removeResult(String message) {
        if (message.equals("remove")) {
            resultArr.remove(0);
        }
    }

    public void inquiryResults(String message) {
        if (message.equals("inquiry")) {
            System.out.println(resultArr);
        }
    }

    public double calculateCircleArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("원의 너비: " + area);
        return area;
    }

    public ArrayList<Double> getCircleArr() {
        System.out.println(circleArr);
        return circleArr;
    }

    public void setCircleArr(double radius) {
        double area = PI * radius * radius;
        circleArr.add(area);
    }

}

