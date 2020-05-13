package hust.soict.hedspi.gui.javafx.transformation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
 
public class MultipleTransformationsExample extends Application {
   @Override
   public void start(Stage stage) {
 
      final int x = 200;
      final int y = 10;
      final int width = 130;
      final int height = 170;
      int pivotX = 30;
      int pivotY = 50;
 
      // Rectangle1
      Rectangle rectangle1 = new Rectangle(x, y, width, height);
      rectangle1.setFill(Color.BLUE);
      rectangle1.setStroke(Color.BLACK);
 
      // Rectangle2
      Rectangle rectangle2 = new Rectangle(x, y, width, height);
      rectangle2.setFill(Color.BURLYWOOD);
      rectangle2.setStroke(Color.BLACK);
 
      // Rectangle3
      Rectangle rectangle3 = new Rectangle(x, y, width, height);
      rectangle3.setFill(Color.BISQUE);
      rectangle3.setStroke(Color.BLACK);
 
      Circle pivot = new Circle(pivotX, pivotY, 3);
      pivot.setFill(Color.RED);
 
      // Creating the rotation transformation
      Rotate rotate = new Rotate();
 
      // Setting the angle for the rotation (20 degrees)
      rotate.setAngle(20);
 
      // Setting pivot points for the rotation
      rotate.setPivotX(pivotX);
      rotate.setPivotY(pivotY);
 
      // Adding the transformation to rectangle2
      rectangle2.getTransforms().addAll(rotate);
 
      // Create Translation Transformation.
      Translate translate = new Translate(100, 150);
 
      // Adding 2 transformations to rectangle3
      rectangle3.getTransforms().addAll(rotate, translate);
 
 
      Group root = new Group(rectangle1, rectangle2,rectangle3, pivot);
 
      Scene scene = new Scene(root, 450, 500);
      stage.setTitle("JavaFX Multi Transformations (o7planning.org)");
      stage.setScene(scene);
      stage.show();
   }
 
   public static void main(String args[]) {
      launch(args);
   }
}