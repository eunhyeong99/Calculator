import java.util.ArrayList;

public class CircleCalculator extends Calculator{
    public double calculateCircleArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("원의 너비: " + area);
        return area;
    }

    public ArrayList<Double> getCircleArr() {
        System.out.println(super.circleArr);
        return super.circleArr;
    }

    public void setCircleArr(double radius) {
        double area = PI * radius * radius;
        super.circleArr.add(area);
    }
}
