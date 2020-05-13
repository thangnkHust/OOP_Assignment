package hust.soict.hedspi.gui.javafx.effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.BoxBlur;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class BoxBlurEffectExample extends Application {
 
    @Override
    public void start(Stage stage) {
 
        double x = 10;
        double y = 150;
 
        Text text = new Text();
        text.setText("Blurry Text!");
        text.setFill(Color.web("0x3b596d"));
        text.setFont(Font.font(null, FontWeight.BOLD, 70));
        text.setX(x);
        text.setY(y);
 
        BoxBlur boxBlur = new BoxBlur();
 
        // Min: 0.0 Max: 255.0
        boxBlur.setWidth(10);
 
        // Min: 0.0 Max: 255.0
        boxBlur.setHeight(5);
 
        // Min: 0 Max: 3
        boxBlur.setIterations(3);
        text.setEffect(boxBlur);
 
        Group root = new Group();
 
        root.getChildren().addAll(text);
 
        Scene scene = new Scene(root, 450, 250);
        stage.setTitle("JavaFX BoxBlur Effect (o7planning.org)");
        stage.setScene(scene);
 
        stage.show();
 
    }
 
    public static void main(String args[]) {
        launch(args);
    }
 
}