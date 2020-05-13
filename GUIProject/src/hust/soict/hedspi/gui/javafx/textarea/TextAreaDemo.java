package hust.soict.hedspi.gui.javafx.textarea;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class TextAreaDemo extends Application {
 
    @Override
    public void start(Stage primaryStage) throws Exception {
 
          
 
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);
        
        root.getChildren().add(new Label("Enter message:"));
 
        TextArea textArea = new TextArea();
        root.getChildren().add(textArea);
 
        Scene scene = new Scene(root, 320, 150);
 
        primaryStage.setTitle("JavaFX TextArea (o7planning.org)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}