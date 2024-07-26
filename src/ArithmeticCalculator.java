import java.util.ArrayList;
class AddOperator {
    public int operate(int firstNum,int secondNum) {
        int result = firstNum + secondNum;
        return result;
    }
}

class SubtractOperator {
    public int operate(int firstNum,int secondNum) {
        int result = firstNum - secondNum;
        return result;
    }
}

class MultiplyOperator {
    public int operate(int firstNum,int secondNum) {
        int result = firstNum * secondNum;
        return result;
    }
}


class DivideOperator {
    public int operate(int firstNum,int secondNum) {
        int result = firstNum / secondNum;
        return result;
    }
}
public class ArithmeticCalculator extends Calculator{


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
