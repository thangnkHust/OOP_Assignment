package hust.soict.hedspi.gui.javafx.textfield;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class TextFieldDemo  extends Application {
 
    @Override
    public void start(Stage primaryStage) throws Exception {
 
        TextField textField = new TextField("Tran");
        textField.setMinWidth(120);
 
        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10));
 
        root.getChildren().add(textField);
 
        Scene scene = new Scene(root, 200, 100);
 
        primaryStage.setTitle("JavaFX TextField (o7planning.org)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        Application.launch(args);
    }
 
}
