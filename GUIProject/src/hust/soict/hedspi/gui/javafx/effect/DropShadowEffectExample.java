package hust.soict.hedspi.gui.javafx.effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class DropShadowEffectExample extends Application {
 
    @Override
    public void start(Stage stage) {
 
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(5.0);
        dropShadow.setOffsetX(3.0);
        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.color(0.4, 0.5, 0.5));
 
        Text text = new Text();
        text.setCache(true);
        text.setX(10.0);
        text.setY(70.0);
        text.setFill(Color.web("0x3b596d"));
        text.setText("JavaFX Drop Shadow...");
        text.setFont(Font.font(null, FontWeight.BOLD, 40));
         
        text.setEffect(dropShadow);
 
        DropShadow dropShadow2 = new DropShadow();
        dropShadow2.setOffsetX(70.0);
        dropShadow2.setOffsetY(45.0);
        dropShadow2.setRadius(20);
 
        Rectangle rect = new Rectangle(20, 150, 250, 100);
        rect.setFill(Color.STEELBLUE);
        rect.setCache(true);
         
        rect.setEffect(dropShadow2);
 
        Group root = new Group();
 
        root.getChildren().addAll(rect, text);
 
        Scene scene = new Scene(root, 450, 350);
        stage.setTitle("JavaFX Drop Shadow Effect (o7planning.org)");
        stage.setScene(scene);
 
        stage.show();
 
    }
 
    public static void main(String args[]) {
        launch(args);
    }
 
}