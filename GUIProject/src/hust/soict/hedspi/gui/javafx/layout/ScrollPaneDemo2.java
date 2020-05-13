package hust.soict.hedspi.gui.javafx.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class ScrollPaneDemo2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
  
        final FlowPane container = new FlowPane();
        
        // Button 1
        Button button1= new Button("Button 1");
        button1.setPrefSize(350, 100);
        
        container.getChildren().add(button1);
        
        // Button 2
        Button button2= new Button("Button 2");
        button2.setPrefSize(245, 220);
        
        container.getChildren().add(button2);
      
        // ScrollPane
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(container);
        
        // Pannable.
        scrollPane.setPannable(true);
      
 
        primaryStage.setTitle("ScrollPane Demo 2 (o7planning.org)");
        Scene scene = new Scene(scrollPane, 550, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}