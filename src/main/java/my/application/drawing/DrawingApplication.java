package my.application.drawing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by samira on 11/14 /16.
 */
public class DrawingApplication {

    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        ShapesForDrowing shapesForDrowing=(ShapesForDrowing)context.getBean("shapeDrawing");
        shapesForDrowing.drowTriangular();

    }
}
