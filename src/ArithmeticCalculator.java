import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ArithmeticCalculator extends Calculator {

    Operator operator;
    public void Calculate(int a,int b,String op){
        switch (op){
            case "+":
                operator = Operator.ADDOPERATOR;
                break;
            case "-":
                operator = Operator.SUBSTRACTOPERATOR;
                break;
            case "*":
                operator = Operator.MULTIPLYOPERATOR;
                break;
            case "/":
                operator = Operator.DIVIDEOPERATOR;
                break;
            case "%":
                operator = Operator.MODOPERATOR;
                break;
        }
        double result = operator.operate(a, b);
        setResultArr(result);
    }

    public ArrayList<Double> getResultArr() {
        return super.resultArr;
    }

    public void setResultArr(double result) {
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

    public void printResultsGreatest(double value) {
        List<Double> results = resultArr.stream()
                .filter(result -> result > value)
                .collect(Collectors.toList());

        System.out.println("입력된 값보다 큰 연산 결과: " + results);
    }
}
