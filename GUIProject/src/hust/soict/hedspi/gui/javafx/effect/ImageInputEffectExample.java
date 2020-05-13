package hust.soict.hedspi.gui.javafx.effect;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.stage.Stage;
 
public class ImageInputEffectExample extends Application {
 
   @Override
   public void start(Stage stage) {
 
      double x = 10;
      double y = 10;
 
      // Button
      Button button = new Button("Click me to apply ImageInput effect to me");
 
      button.setLayoutX(100);
      button.setLayoutY(30);
 
      button.setPrefSize(250, 50);
 
      button.setOnAction(new EventHandler<ActionEvent>() {
 
         @Override
         public void handle(ActionEvent event) {
            String imageUrl= "/hust/soict/hedspi/gui/javafx/utils/1.png";
            Image image = new Image(imageUrl);
 
            ImageInput imageInput = new ImageInput();
            imageInput.setSource(image);
            imageInput.setX(x);
            imageInput.setY(y);
 
            // Setting ColorInput effect
            button.setEffect(imageInput);
         }
      });
 
      Group root = new Group();
 
      root.getChildren().addAll(button );
 
      Scene scene = new Scene(root, 450, 250);
      stage.setTitle("JavaFX ImageInput Effect (o7planning.org)");
      stage.setScene(scene);
 
      stage.show();
 
   }
 
   public static void main(String args[]) {
      launch(args);
   }
 
}
