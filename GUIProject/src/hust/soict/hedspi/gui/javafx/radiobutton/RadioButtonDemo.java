package hust.soict.hedspi.gui.javafx.radiobutton;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
 
public class RadioButtonDemo extends Application {
 
    @Override
    public void start(Stage stage) {
 
        Label label = new Label("Your Gender: ");
 
        // Group
        ToggleGroup group = new ToggleGroup();
 
        // Radio 1: Male
        RadioButton button1 = new RadioButton("Male");
        button1.setToggleGroup(group);
        button1.setSelected(true);
 
        // Radio 3: Female.
        RadioButton button2 = new RadioButton("Female");
        button2.setToggleGroup(group);
 
        HBox root = new HBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);
        root.getChildren().addAll(label, button1, button2);
 
        Scene scene = new Scene(root, 400, 150);
        stage.setScene(scene);
        stage.setTitle("JavaFX RadioButton (o7planning.org)");
        scene.setRoot(root);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
 
}