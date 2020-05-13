package hust.soict.hedspi.gui.javafx.button;

import java.util.Date;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class ButtonEventDemo extends Application {
 
    @Override
    public void start(Stage primaryStage) throws Exception {
 
        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
        root.setHgap(10);
        root.setVgap(10);
 
        // Button
        Button button = new Button("Show Time");
        Label label = new Label("");
 
        button.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                label.setText(new Date().toString());
            }
        });
 
        root.getChildren().addAll(button,label);
 
        primaryStage.setTitle("Java Button (o7planning.org)");
 
        Scene scene = new Scene(root, 350, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
 
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}