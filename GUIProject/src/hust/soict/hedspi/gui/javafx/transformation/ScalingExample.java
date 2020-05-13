package hust.soict.hedspi.gui.javafx.transformation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
 
public class ScalingExample extends Application {
    @Override
    public void start(Stage stage) {
 
        final int x = 80;
        final int y = 90;
        final int width = 100;
        final int height = 70;
 
        int pivotX = 30;
        int pivotY = 50;
        double scaleX = 2;
        double scaleY = 4;
 
        // Rectangle1
        Rectangle rectangle1 = new Rectangle(x, y, width, height);
        rectangle1.setFill(Color.BLUE);
        rectangle1.setStroke(Color.BLACK);
 
        // Rectangle2
        Rectangle rectangle2 = new Rectangle(x, y, width, height);
        rectangle2.setFill(Color.BURLYWOOD);
        rectangle2.setStroke(Color.BLACK);
 
        Circle pivot = new Circle(pivotX, pivotY, 3);
        pivot.setFill(Color.RED);
 
        // Creating the Scale transformation
        Scale scale = new Scale();
 
        // Setting the scaliing factor.
        scale.setX(scaleX);
        scale.setY(scaleY);
 
        // Setting Orgin of new coordinate system
        scale.setPivotX(pivotX);
        scale.setPivotY(pivotY);
 
        // Adding the transformation to rectangle2
        rectangle2.getTransforms().addAll(scale);
 
        Group root = new Group(rectangle1, rectangle2, pivot);
        Scene scene = new Scene(root, 450, 500);
        stage.setTitle("JavaFX Scaling Transformation (o7planning.org)");
        stage.setScene(scene);
 
        stage.show();
    }
 
    public static void main(String args[]) {
        launch(args);
    }
 
}
