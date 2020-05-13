package hust.soict.hedspi.gui.javafx.effect;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
 
public class ColorInputEffectExample extends Application {
 
   @Override
   public void start(Stage stage) {
 
      double x = 10;
      double y = 10;
      double w = 40;
      double h = 180;
       
      // Rectangle
      Rectangle rect = new Rectangle(x, y, w, h);
      rect.setFill(Color.WHITE);
      rect.setStrokeWidth(1);
      rect.setStroke(Color.BLACK);
       
      // Button
      Button button = new Button("Click me to apply ColorInput effect to me");
 
      button.setLayoutX(100);
      button.setLayoutY(30);
 
      button.setPrefSize(250, 150);
 
      button.setOnAction(new EventHandler<ActionEvent>() {
 
         @Override
         public void handle(ActionEvent event) {
            ColorInput colorInput = new ColorInput();
            colorInput.setPaint(Color.STEELBLUE);
            colorInput.setX(x);
            colorInput.setY(y);
            colorInput.setWidth(w);
            colorInput.setHeight(h);
 
            // Setting ColorInput effect
            button.setEffect(colorInput);
         }
      });
 
      Group root = new Group();
 
      root.getChildren().addAll(button, rect);
 
      Scene scene = new Scene(root, 450, 300);
      stage.setTitle("JavaFX ColorInput Effect (o7planning.org)");
      stage.setScene(scene);
 
      stage.show();
 
   }
 
   public static void main(String args[]) {
      launch(args);
   }
    
}