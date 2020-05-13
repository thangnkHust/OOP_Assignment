package hust.soict.hedspi.gui.javafx.effect;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
 
public class GaussianBlurEffectExample extends Application {
 
    // 30 millisencond.
    private static final int UI_ANIMATION_TIME_MSEC = 30000;
 
    private static final double MIN_RADIUS = 0.0;
    private static final double MAX_RADIUS = 70.0;
 
    private void applyEffect(Node node) {
        // Create Gaussian Blur effect with radius = 0
        GaussianBlur blur = new GaussianBlur(MIN_RADIUS);
        node.setEffect(blur);
 
        // Create animation effect
        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(blur.radiusProperty(), MAX_RADIUS);
        KeyFrame kf = new KeyFrame(Duration.millis(UI_ANIMATION_TIME_MSEC), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();
    }
 
    @Override
    public void start(Stage stage) {
 
        Text text = new Text();
        text.setX(120.0);
        text.setY(150.0);
        text.setText("!");
        text.setFill(Color.web("0x3b596d"));
        text.setFont(Font.font(null, FontWeight.BOLD, 160));
 
        this.applyEffect(text);
 
        Group root = new Group();
 
        root.getChildren().addAll(text);
 
        Scene scene = new Scene(root, 450, 250);
        stage.setTitle("JavaFX Gaussian Blur Effect (o7planning.org)");
        stage.setScene(scene);
 
        stage.show();
 
    }
 
    public static void main(String args[]) {
        launch(args);
    }
 
}
