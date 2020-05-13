package hust.soict.hedspi.gui.javafx.passwordfield;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class PasswordFieldDemo extends Application {
 
   @Override
   public void start(Stage primaryStage) throws Exception {
 
       PasswordField passwordField = new PasswordField();
       Button button = new Button("Show Password");
       Label label = new Label("?");
 
       button.setOnAction(new EventHandler<ActionEvent>() {
 
           @Override
           public void handle(ActionEvent event) {
               String password = passwordField.getText();
               label.setText(password);
           }
       });
 
       FlowPane root = new FlowPane();
       root.setPadding(new Insets(10));
       root.setVgap(5);
       root.setHgap(5);
 
       root.getChildren().addAll(label, passwordField, button);
 
       Scene scene = new Scene(root, 320, 150);
 
       primaryStage.setTitle("JavaFX PasswordField (o7planning.org)");
       primaryStage.setScene(scene);
       primaryStage.show();
   }
 
   public static void main(String[] args) {
       Application.launch(args);
   }
 
}