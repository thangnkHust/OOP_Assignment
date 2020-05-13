package hust.soict.hedspi.gui.javafx.effect;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Bloom;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class BloomEffectExample extends Application {
 
   @Override
   public void start(Stage stage) {
 
      Label label = new Label();
      label.setLayoutX(10);
      label.setLayoutY(50);
 
      Rectangle rect = new Rectangle();
      rect.setX(10);
      rect.setY(70);
      rect.setWidth(360);
      rect.setHeight(80);
      rect.setFill(Color.DARKSLATEBLUE);
 
      Text text = new Text();
      text.setText("Bloom!");
      text.setFill(Color.ALICEBLUE);
      text.setFont(Font.font(null, FontWeight.BOLD, 40));
      text.setX(25);
      text.setY(125);
 
      // Create Bloom Effect
      Bloom bloom = new Bloom();
      // Setting Threshold
      bloom.setThreshold(0.8);
      text.setEffect(bloom);
 
      Button plusButton = new Button("+");
      plusButton.setLayoutX(50);
      plusButton.setLayoutY(10);
      plusButton.setOnAction(new EventHandler<ActionEvent>() {
 
         @Override
         public void handle(ActionEvent event) {
            double threshold = bloom.getThreshold();
            threshold += 0.1;
            if (threshold > 1) {
               threshold = 1;
            }
            bloom.setThreshold(threshold);
            label.setText("Threshold: " + threshold);
         }
      });
 
      Button minusButton = new Button("-");
      minusButton.setLayoutX(10);
      minusButton.setLayoutY(10);
      minusButton.setOnAction(new EventHandler<ActionEvent>() {
 
         @Override
         public void handle(ActionEvent event) {
            double threshold = bloom.getThreshold();
            threshold -= 0.1;
            if (threshold < 0) {
               threshold = 0;
            }
            bloom.setThreshold(threshold);
            label.setText("Threshold: " + threshold);
         }
      });
      Group root = new Group();
 
      root.getChildren().addAll(rect, text, label, minusButton, plusButton);
 
      Scene scene = new Scene(root, 450, 250);
      stage.setTitle("JavaFX Bloom Effect (o7planning.org)");
      stage.setScene(scene);
 
      stage.show();
 
   }
 
   public static void main(String args[]) {
      launch(args);
   }
 
}