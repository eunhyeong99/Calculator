import java.util.ArrayList;

class DivisionByZeroException {
    public DivisionByZeroException(String message) {
        System.out.println(message);
    }

}

public class Calculator {

    //연산결과를 저장하는 List
    protected ArrayList<Integer> resultArr;
    protected ArrayList<Double> circleArr;
    protected static final double PI = 3.141592;


    // 생성자
    public Calculator() {
        this.resultArr = new ArrayList<>();
        this.circleArr = new ArrayList<>();
    }






}

