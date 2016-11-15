package my.application.drawing;

import my.application.drawing.Triangular;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by samira on 11/15/16.
 */
public class ShapesForDrowing {

    private Triangular triangular;
    @Autowired
    public void setTriangular(Triangular triangular){
        this.triangular=triangular;
    }
    public void drowTriangular(){
        System.out.println(triangular.toString());
    }
}
