package hust.soict.hedspi.gui.javafx.accordion;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class GroupOfTitledPane extends Application {
 
   @Override
   public void start(Stage stage) {
 
       // Create First TitledPane.
       TitledPane firstTitledPane = new TitledPane();
       firstTitledPane.setText("Java");
 
       VBox content1 = new VBox();
       content1.getChildren().add(new Label("Java Swing Tutorial"));
       content1.getChildren().add(new Label("JavaFx Tutorial"));
       content1.getChildren().add(new Label("Java IO Tutorial"));
 
       firstTitledPane.setContent(content1);
 
       // Create Second TitledPane.
       TitledPane secondTitledPane = new TitledPane();
       secondTitledPane.setText("CShape");
 
       VBox content2 = new VBox();
       content2.getChildren().add(new Label("CShape Tutorial for Beginners"));
       content2.getChildren().add(new Label("CShape Enums Tutorial"));
 
       secondTitledPane.setContent(content2);
 
       // Create Root Pane.
       VBox root = new VBox();
       root.setPadding(new Insets(20, 10, 10, 10));
       root.getChildren().addAll(firstTitledPane, secondTitledPane);
       Scene scene = new Scene(root, 300, 200);
 
       stage.setTitle("Group Of TitledPane (o7planning.org)");
       stage.setScene(scene);
       stage.show();
   }
 
   public static void main(String[] args) {
       Application.launch(args);
   }
  
}