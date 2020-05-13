package hust.soict.hedspi.gui.javafx.rectangle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
 
public class RectangleDemo extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        Rectangle rectangle = new Rectangle();
        rectangle.setX(20);
        rectangle.setY(50);
        rectangle.setWidth(200);
        rectangle.setHeight(150);
        rectangle.setFill(Color.BISQUE);
 
        Group root = new Group();
        root.getChildren().add(rectangle);
 
        Scene scene = new Scene(root, 400, 250, Color.WHITE);
        primaryStage.setTitle("JavaFX Rectangle (o7planning.org)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}
