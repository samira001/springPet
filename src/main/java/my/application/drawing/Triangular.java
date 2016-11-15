package my.application.drawing;
import my.application.drawing.Point;
/**
 * Created by samira on 11/15/16.
 */
public class Triangular {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(my.application.drawing.Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(my.application.drawing.Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(my.application.drawing.Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangular{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
}
