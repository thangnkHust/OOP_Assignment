package hust.soict.hedspi.gui.javafx.group;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class GroupDemo extends Application {
 
    @Override
    public void start(Stage primaryStage) throws Exception {
 
        Button button1 = new Button("This is a long button");
        button1.setPrefSize(180, 80);
         
        Button button2 = new Button("Short button");
         
        Text text = new Text("Text");
        text.setFont(new Font("Arial",20));
        text.setX(200);
        text.setY(100);
         
        Group root = new Group();
         
 
        root.getChildren().addAll(button1, button2,text);
 
        Scene scene = new Scene(root, 250, 100);
 
        primaryStage.setTitle("JavaFX Group (o7planning.org)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}