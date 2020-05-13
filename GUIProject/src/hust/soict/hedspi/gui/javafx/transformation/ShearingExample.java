package hust.soict.hedspi.gui.javafx.transformation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;
 
public class ShearingExample extends Application {
     
    @Override
    public void start(Stage stage) {
        final int x = 120;
        final int y = 80;
        final int width = 150;
        final int height = 100;
 
        int pivotX = 40;
        int pivotY = 50;
        double shearX = 0.2;
        double shearY = 0.5;
 
        // (all)
        // Rectangle1
        Rectangle rectangle1 = new Rectangle(x, y, width, height);
        rectangle1.setFill(Color.BLUE);
        rectangle1.setStroke(Color.BLACK);
 
        // (all)
        // Rectangle2
        Rectangle rectangle2 = new Rectangle(x, y, width, height);
        rectangle2.setFill(Color.BURLYWOOD);
        rectangle2.setStroke(Color.BLACK);
 
        Circle pivot = new Circle(pivotX, pivotY, 3);
        pivot.setFill(Color.RED);
 
        // Creating the Shearing transformation
        Shear shear = new Shear();
 
        // Setting the pivot point
        shear.setPivotX(pivotX);
        shear.setPivotY(pivotY);
 
        // Setting the shearing factor
        shear.setX(shearX);
        shear.setY(shearY);
 
        // Adding the transformation to rectangle2
        rectangle2.getTransforms().addAll(shear);
 
        Group root = new Group(rectangle1, rectangle2, pivot);
        Scene scene = new Scene(root, 450, 300);
        stage.setTitle("Shearing Transformation (o7planning.org)");
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String args[]) {
        launch(args);
    }
}
