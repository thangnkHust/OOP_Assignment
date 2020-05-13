package hust.soict.hedspi.gui.javafx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class TitledPaneDemo extends Application {
 
   public static void main(String[] args) {
       Application.launch(args);
   }
 
   @Override
   public void start(Stage stage) {
 
       // Create TitledPane.
       TitledPane titledPane = new TitledPane();
       titledPane.setText("Java");
 
       // Content for TitledPane
       VBox content = new VBox();
       content.getChildren().add(new Label("Java Swing Tutorial"));
       content.getChildren().add(new Label("JavaFx Tutorial"));
       content.getChildren().add(new Label("Java IO Tutorial"));
 
       titledPane.setContent(content);
 
        // Set Expaneded.
        titledPane.setExpanded(true);
 
       //
       VBox root= new VBox();
       root.setPadding(new Insets(5));
       root.getChildren().add(titledPane);
      
       Scene scene = new Scene(root, 250, 200);
 
       stage.setTitle("TitledPane (o7planning.org)");
       stage.setScene(scene);
       stage.show();
   }
  
}