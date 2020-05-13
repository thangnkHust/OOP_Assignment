package hust.soict.hedspi.gui.javafx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneDemo extends Application {
 
    @Override
    public void start(Stage primaryStage) throws Exception {
        TilePane root = new TilePane();
         
        root.setPadding(new Insets(10,10,10,10));        
        root.setHgap(20);
        root.setVgap(30);
         
        Button button = new Button("Java");
        root.getChildren().add(button);
         
        // Short Button
        Button button1 = new Button("C/C++");
        button1.setPrefSize(70, 50);
        root.getChildren().add(button1);
         
        // Short Button
        Button button2 = new Button("C#");
         
        root.getChildren().add(button2);
         
        // Button
        Button longButton3 = new Button("Objective C");
        root.getChildren().add(longButton3);
         
        // Button
        Button button4 = new Button("Swift");
        root.getChildren().add(button4);
 
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setTitle("TilePanel Layout Demo (o7planning.org)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}