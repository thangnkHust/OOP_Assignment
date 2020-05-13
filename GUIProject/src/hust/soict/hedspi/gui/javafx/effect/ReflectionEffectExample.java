package hust.soict.hedspi.gui.javafx.effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class ReflectionEffectExample extends Application {
 
   @Override
   public void start(Stage stage) {
 
      Reflection reflection = new Reflection();
 
      // Setting the bottom opacity of the reflection
      reflection.setBottomOpacity(0.0);
 
      // Setting the top opacity of the reflection
      reflection.setTopOpacity(0.5);
 
      // Setting the top offset of the reflection
      reflection.setTopOffset(10);
 
      // Setting the fraction of the reflection
      reflection.setFraction(0.7);
 
      Text text = new Text();
      text.setX(20.0);
      text.setY(90.0);
 
      text.setCache(true);
      text.setText("JavaFX");
      text.setFill(Color.web("0x3b596d"));
      text.setFont(Font.font(null, FontWeight.BOLD, 80));
 
      text.setEffect(reflection);
 
      Group root = new Group();
 
      root.getChildren().addAll(text);
 
      Scene scene = new Scene(root, 450, 250);
      stage.setTitle("JavaFX Reflection Effect (o7planning.org)");
      stage.setScene(scene);
 
      stage.show();
 
   }
 
   public static void main(String args[]) {
      launch(args);
   }
}