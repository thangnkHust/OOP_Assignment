package hust.soict.hedspi.gui.javafx.effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.MotionBlur;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class MotionBlurEffectExample extends Application {
 
    @Override
    public void start(Stage stage) {
 
        MotionBlur motionBlur = new MotionBlur();
        motionBlur.setRadius(55);
        motionBlur.setAngle(150.0);
 
        Text text = new Text();
        text.setX(120.0);
        text.setY(150.0);
        text.setText("!");
        text.setFill(Color.web("0x3b596d"));
        text.setFont(Font.font(null, FontWeight.BOLD, 160));
        text.setEffect(motionBlur);
 
        Group root = new Group();
 
        root.getChildren().addAll(text);
 
        Scene scene = new Scene(root, 450, 250);
        stage.setTitle("JavaFX Motion Blur Effect (o7planning.org)");
        stage.setScene(scene);
 
        stage.show();
 
    }
 
    public static void main(String args[]) {
        launch(args);
    }
}