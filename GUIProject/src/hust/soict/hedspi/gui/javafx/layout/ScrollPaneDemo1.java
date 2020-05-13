package hust.soict.hedspi.gui.javafx.layout;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.stage.Stage;
 
public class ScrollPaneDemo1 extends Application {
 
    @Override
    public void start(Stage primaryStage) {
 
        // Create a ScrollPane
        ScrollPane scrollPane = new ScrollPane();
 
        Button button = new Button("My Button");
        button.setPrefSize(400, 300);
 
        // Set content for ScrollPane
        scrollPane.setContent(button);
 
        // Always show vertical scroll bar
        scrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
        
        // Horizontal scroll bar is only displayed when needed
        scrollPane.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
 
        primaryStage.setTitle("ScrollPane Demo 1 (o7planning.org)");
        Scene scene = new Scene(scrollPane, 550, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}