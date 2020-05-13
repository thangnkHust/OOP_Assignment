package hust.soict.hedspi.gui.javafx.transformation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Affine;
import javafx.stage.Stage;
 
public class AffineExample extends Application {
    
   @Override
   public void start(Stage stage) {
 
      final int x = 80;
      final int y = 90;
      final int width = 100;
      final int height = 70;
 
      double mxx = 0.2;
      double mxy = 1.5;
      double myx = 1.5;
      double myy = 0.5;
 
      double tx = 40;
      double ty = 50;
 
      // Rectangle1
      Rectangle rectangle1 = new Rectangle(x, y, width, height);
      rectangle1.setFill(Color.BLUE);
      rectangle1.setStroke(Color.BLACK);
 
      // Rectangle2
      Rectangle rectangle2 = new Rectangle(x, y, width, height);
      rectangle2.setFill(Color.BURLYWOOD);
      rectangle2.setStroke(Color.BLACK);
 
      Circle pivot = new Circle(tx, ty, 3);
      pivot.setFill(Color.RED);
 
      // Creating the 2D Affine transformation
      Affine affine = new Affine(mxx, mxy, tx, myx, myy, ty);
 
     
 
      // Adding the transformation to rectangle2
      rectangle2.getTransforms().addAll(affine);
 
      Group root = new Group(rectangle1, rectangle2, pivot);
      Scene scene = new Scene(root, 450, 500);
      stage.setTitle("JavaFX Affine Transformation (o7planning.org)");
      stage.setScene(scene);
 
      stage.show();
   }
 
   public static void main(String args[]) {
      launch(args);
   }
 
}
